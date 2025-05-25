package org.example.Chapter26_Thread.WaitAndNotify;

public class Table {


    //判断桌子上是否有食物
    public static int foodFlag = 0;

    //总个数
    public static int count = 10;

    //锁对象
    public final static Object lock = new Object();
}
