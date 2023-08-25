package com.atguigu._Interface.exer1;

/**
 * @author : Yac
 * @date : 2023/8/7
 */
public class USBTest {
    public static void main(String[] args) {
        //1.创建接口实现类的对象
        Computer computer=new Computer();
        Printer printer=new Printer();
        computer.transferData(printer);
        System.out.println("-----------");
        //2.创建接口实现类的匿名对象
        computer.transferData(new Camera());
    }

}
