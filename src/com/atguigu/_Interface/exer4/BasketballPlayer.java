package com.atguigu._Interface.exer4;

/**
 * @author : Yac
 * @date : 2023/8/9
 */
public class BasketballPlayer extends Sportsman {
    @Override
    public void train() {
        System.out.println("篮球运动员：篮球训练");

    }

    @Override
    public void play() {
        System.out.println("篮球运动员：打篮球比赛");
    }
}
