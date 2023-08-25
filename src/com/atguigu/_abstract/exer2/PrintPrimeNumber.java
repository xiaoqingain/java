package com.atguigu._abstract.exer2;

/**
 * @author : Yac
 * @date : 2023/8/6
 */
public class PrintPrimeNumber extends Template {

    @Override
    public void cade() {
        for (int i = 2;i<=100000;i++){
            boolean isFlag=true;
            for (int j=2;j<=Math.sqrt((i));j++){
                if (i%j==0){
                    isFlag=false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}
