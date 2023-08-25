package com.atguigu._enum.exer2;



/**
 * @author : Yac
 * @date : 2023/8/13
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.toString());
        System.out.println(Season.SUMMER.getClass().getSuperclass().getClass());
        Season[] values=Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        String objName="AUTUMN";
        Season.valueOf(objName);
        Season season= Season.valueOf(objName);
        System.out.println(season);
    }


}
