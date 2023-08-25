package com.atguigu._Interface.exer2;

/**
 * @author : Yac
 * @date : 2023/8/8
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables=new Eatable[3];
        eatables[0]=new Chinese();
        eatables[1]=new American();
        eatables[2]=new Indian();
        for (int i = 0; i < eatables.length; i++) {
          eatables[i].eat();
        }

    }
}
