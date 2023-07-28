package com.demo.exercise;

public class phoneTest {
    public static void main(String[] args) {
            Phone p1=new Phone("华为",4000,8,"华为p50");
            p1.phone();
            p1.call(4);
            p1.playMusic(2);
            p1.playGames();
            Phone p2=new Phone();
            p2.setBrand("apple");
            p2.setPrice(2900);
            p2.setMemory(8);
            p2.setModel("小米13");
            p2.phone();
            p2.call(4);
            p2.playMusic(2);


    }
}
