package com.atguigu._Interface.exer1;

/**
 * @author : Yac
 * @date : 2023/8/7
 */
public class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
