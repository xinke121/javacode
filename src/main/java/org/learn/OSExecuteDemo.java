package org.learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class OSExecuteDemo {

    public static void main(String[] args) {
        // Date d = new Date();
        // SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String currdate = format.format(d);
        // System.out.println("现在的日期是：" + currdate);
        //
        // Calendar ca = Calendar.getInstance();
        // ca.add(Calendar.DATE, 11);// num为增加的天数，可以改变的
        // d = ca.getTime();
        // String enddate = format.format(d);
        // System.out.println("增加天数以后的日期：" + enddate);
        //
        // System.out.println("输入天数：");

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
