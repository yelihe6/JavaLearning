package org.example.chapter13_API_Runtime;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

        System.out.println(Runtime.getRuntime());//运行环境对象地址值
        System.out.println(Runtime.getRuntime().availableProcessors());//CPU线程数
        System.out.println((double) (Runtime.getRuntime().maxMemory()/1024/1024));//JVM能从系统中获取的内存大小
        System.out.println((double) (Runtime.getRuntime().totalMemory()/1024/1024));//JVM已经从系统中获取的内存大小
        System.out.println((double) (Runtime.getRuntime().freeMemory()/1024/1024));//JVM还剩多少内存
//        Runtime.getRuntime().exit(0);

        //运行cmd命令
        //shutdown :关机
        //加上参数才能执行
        //-s :默认在1分钟之后关机
        //-s -t指定时间
        //指定关机时间
        //-a : 取消关机操作
        //-r: 关机并重启
        System.out.println(Runtime.getRuntime().exec("notepad"));
    }
}
