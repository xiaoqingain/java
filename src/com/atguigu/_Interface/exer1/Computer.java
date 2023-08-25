package com.atguigu._Interface.exer1;

/**
 * @author : Yac
 * @date : 2023/8/7
 */
public class Computer {
    public void transferData(USB usb){//多态 USB usb=new Printer
        System.out.println("设备连接成功.....");
        usb.start();
        System.out.println("数据传输的细节操作.....");
        usb.stop();
    }
}
