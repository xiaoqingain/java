package com.atguigu._abstract.exer2;

/**
 * @author : Yac
 * @date : 2023/8/6
 */
public  abstract class Template {
    public void spendTime(){
        long start =System.currentTimeMillis();
        cade();
        long end =System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start));
    }
    public abstract void cade();
}
