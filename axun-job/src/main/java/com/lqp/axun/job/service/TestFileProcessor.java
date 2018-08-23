package com.lqp.axun.job.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class TestFileProcessor implements ItemProcessor<TestReport, TestReport> {
    @Override
    public TestReport process(final TestReport testReport) throws Exception {
        testReport.setTimeSection(CommonUtils.getTimeSection(0, 0, 0));
        log.info("StatisticResult 【" + testReport + "】");
        return testReport;
    }
}
