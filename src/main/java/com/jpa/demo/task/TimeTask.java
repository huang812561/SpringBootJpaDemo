package com.jpa.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName:com.jpa.demo.task.TimeTask
 * @Decription：定时任务测试
 * @Author： huang_guoqiang
 * @Date 2018年07月12日 17:20
 */
@Component
public class TimeTask {

    /**
     * logger
     **/
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeTask.class);

    /**
     * 秒（0~59）
     分钟（0~59）
     小时（0~23）
     天（月）（0~31，但是你需要考虑你月的天数）
     月（0~11）
     天（星期）（1~7 1=SUN 或 SUN，MON，TUE，WED，THU，FRI，SAT）
     7.年份（1970－2099）
     */
    @Scheduled(cron = "*/5 * * * * *")
    public void doTask1() {
        System.out.println("doTask1 : " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        System.out.println("123");
    }

    /**
     * fixedRate:上一次开始执行时间点之后5秒再执行
     * fixedDelay :上一次执行完毕时间点之后5秒再执行
     * initialDelay：第一次延迟1秒后执行
     */
/*    @Scheduled(initialDelay = 1000, fixedRate = 5000)
    public void doTask2() {
        System.out.println("doTask2 : " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
    }*/

}
