package com.xj.expend.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class UserScheduleTask {
    private static final SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //5秒执行一次
    @Scheduled(cron = "*/5 * * * * ?")
    public void timerToNow(){
        System.out.println("time:" +dateFormat.format(new Date()));
    }
}
