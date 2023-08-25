package com.atguigu._Interface.exer4;

/**
 * @author : Yac
 * @date : 2023/8/9
 */
public class CollegeStudent extends Student implements LearnEnglish,StudyComputer{
    @Override
    public void learnEnglish() {
        System.out.println("大学生：学习听写阅读");
    }

    @Override
    public void study() {
        System.out.println("大学生：good good play ,day day up");

    }

    @Override
    public void inspect() {
        System.out.println("大学生：拿60万岁");
    }

    @Override
    public void StudyComputer() {
        System.out.println("大学生：学习计算机操作");
    }
}
