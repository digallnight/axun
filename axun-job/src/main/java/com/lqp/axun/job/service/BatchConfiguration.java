package com.lqp.axun.job.service;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.database.JpaPagingItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @PersistenceUnit
    private EntityManagerFactory emf;

    @StepScope
    public JpaPagingItemReader<TestReport> reader() {
        JpaPagingItemReader<TestReport> reader = new JpaPagingItemReader<TestReport>();
        reader.setQueryString("select new TestReport(ttp.taskId, tra.fileId, ttp.ruleId,sum( tra.count))"
                + " fromTestFile tra,TestTaskProperty ttp WHERE ttp.taskId=tra.taskId AND ttp.beginTimeBETWEEN ?1 AND ?2 "
                + "GROUP BYttp.taskId, tra.fileId, ttp.ruleId");
        Map<String, Object> parameterValues = new HashMap<>();
        parameterValues.put("1", CommonUtils.getTimeSection(0, 0, 0));
        parameterValues.put("2", CommonUtils.getTimeSection(23, 59, 59));
        reader.setParameterValues(parameterValues);
        reader.setEntityManagerFactory(emf);
        reader.setPageSize(Integer.MAX_VALUE);
        return reader;
    }

    @Bean
    public TestFileProcessor processor() {
        return new TestFileProcessor();
    }

    @Bean
    public JpaItemWriter<TestReport> writer() {
        JpaItemWriter<TestReport> writer = new JpaItemWriter<TestReport>();
        writer.setEntityManagerFactory(emf);
        return writer;
    }

    @Bean
    public Step step() {
        return stepBuilderFactory.get("step").<TestReport, TestReport>chunk(10).reader(reader()).processor(processor())
                .writer(writer()).build();
    }

    @Bean
    public Job importUserJob(JobRepository jobRepository) {
        return jobBuilderFactory.get("importUserJob").incrementer(new RunIdIncrementer()).repository(jobRepository)
                .flow(step()).end().build();
    }
}

