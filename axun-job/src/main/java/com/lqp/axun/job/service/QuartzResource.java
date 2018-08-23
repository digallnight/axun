package com.lqp.axun.job.service;

import lombok.extern.slf4j.Slf4j;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@ComponentScan(basePackages = {"com.william.lab.springboot.springbatch.springbatch"})
@RequestMapping("/quartz")
public class QuartzResource {
    private Logger LOGGER = LoggerFactory.getLogger(QuartzResource.class);
    @Autowired
    private CronTriggerFactoryBean cronTriggerFactoryBean;

    final int CREATE_ID = 17;

    @RequestMapping(value = "/get/{taskId}", method = RequestMethod.GET)
    public void createTask(@PathVariable("taskId") String taskId) throws SchedulerException {
        String str[] = taskId.split(",");
        for (int i = 0; i < str.length; i++) {
            int taskIdx = Integer.parseInt(str[i]);
            cronTriggerFactoryBean.createNewTask("00/1 * * * ?", 1);
        }
    }
}

