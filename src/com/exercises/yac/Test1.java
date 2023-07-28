package com.exercises.yac;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
/*需求：
定义方法实现随机数产生一个5为的验证码
验证码格式：
1.长度为5
2.前四位是英文字母的大小写
3.最后一位是数字
 */
        char[] cat=new char[52] ;
        for (int i = 0; i < cat.length; i++) {

            if (i<=25){
                cat[i]=(char) (97+i);

            }else {
                cat[i]=(char) (65+i-26);

            }

        }
        String x=" ";
        for (int i = 0; i < cat.length; i++) {
           // System.out.print(cat[i]+" ");
        }
        Random r=new Random();
        for (int i = 0; i < 4; i++) {

            int s= r.nextInt(cat.length);
            x= x+cat[s];


        }

        int number=r.nextInt(10);
      x+=number;
        System.out.print(x);
    }
}
