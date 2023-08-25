package com.atguigu._Interface.exer4;

/**
 * @author : Yac
 * @date : 2023/8/9
 */
public class FootballPlayer extends Sportsman implements LearnEnglish {
    @Override
    public void learnEnglish() {
        System.out.println("足球运动员：比赛学习英语");
    }

    @Override
    public void train() {
        System.out.println("足球运动员：经行足球训练");
    }

    @Override
    public void play() {
        System.out.println("足球运动员：比赛踢足球");
    }
}
