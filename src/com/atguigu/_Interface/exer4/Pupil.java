package com.atguigu._Interface.exer4;

/**
 * @author : Yac
 * @date : 2023/8/9
 */
public class Pupil extends Student{
    @Override
    public void study() {
        System.out.println("小学生：good good play ,day day happy");
    }

    @Override
    public void inspect() {
        System.out.println("小学生：加油拿100分");
    }
}
