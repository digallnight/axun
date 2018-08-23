package com.lqp.axun.job.main;

import com.lqp.axun.job.service.MyApplicationContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.FileInputStream;
import java.util.Properties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableScheduling
// spring boot 主类默认扫描平级以及以下包的注解，若要扫描其它包，用此方法
@ComponentScan(basePackages = {"com.lqp.axun.job"})
@Slf4j
@PropertySource(value = {"./application.properties"})
public class Application {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        log.info("Start axun-job!");
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() throws Exception {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        Properties quartzProperties = new Properties();
        FileInputStream in = new FileInputStream("./src/main/resources/quartz.properties");
        quartzProperties.load(in);
        schedulerFactoryBean.setQuartzProperties(quartzProperties);
        return schedulerFactoryBean;
    }

    @Bean
    public MyApplicationContextUtil myApplicationContextUtil() {
        return new MyApplicationContextUtil();
    }

}
