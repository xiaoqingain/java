package com.atguigu._Interface.exer1;

/**
 * @author : Yac
 * @date : 2023/8/7
 */
public class Camera implements USB{
    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("照相机结束工作");
    }
}
