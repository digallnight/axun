package com.lqp.axun.job.service;
/**
 * 简单的spirng定时任务示例
 */

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    //每1分钟执行一次
    @Scheduled(cron = "0 */1 *  * * * ") //@Scheduled(fixedRate = 1000 * 30)  定义某个定时任务。
    public void reportCurrentByCron() {
        System.out.println("Scheduling Tasks Examples By Cron: The time is now " + dateFormat().format(new Date()));
    }

    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("HH:mm:ss");
    }

    /**
     * cronExpression的配置说明
     * 字段   允许值   允许的特殊字符
     * 秒    0-59    , - * /
     * 分    0-59    , - * /
     * 小时    0-23    , - * /
     * 日期    1-31    , - * ? / L W C
     * 月份    1-12 或者 JAN-DEC    , - * /
     * 星期    1-7 或者 SUN-SAT    , - * ? / L C #
     * 年（可选）    留空, 1970-2099    , - * /
     * - 区间
     * * 通配符
     * ? 你不想设置那个字段
     * 下面只例出几个式子
     *
     * CRON表达式    含义
     * "0 0 12 * * ?"    每天中午十二点触发
     * "0 15 10 ? * *"    每天早上10：15触发
     * "0 15 10 * * ?"    每天早上10：15触发
     * "0 15 10 * * ? *"    每天早上10：15触发
     * "0 15 10 * * ? 2005"    2005年的每天早上10：15触发
     * "0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发
     * "0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发
     * "0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发
     * "0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发
     * "0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发
     * "0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发
     */
}