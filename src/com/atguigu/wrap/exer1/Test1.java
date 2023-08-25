package com.atguigu.wrap.exer1;

import org.junit.Test;

/**
 * @author : Yac
 * @date : 2023/8/16
 */
public class Test1 {
    @Test
    public void test2(){
        //自动封箱
        int num=10;
        Integer i1=num;
        System.out.println(i1.toString());
        //自动装箱
        Integer i2=num+1;
        System.out.println(i2.toString());
        Boolean b1=true;
        System.out.println(b1.toString());
        Float f1=13.4F;
        System.out.println(f1.toString());
        //自动拆箱
        int ii2=i2;
        System.out.println(ii2);
        boolean b2=b1;
        System.out.println(b2);
    }
}
