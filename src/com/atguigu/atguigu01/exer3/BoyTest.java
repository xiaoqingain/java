package com.atguigu.atguigu01.exer3;

/**
 * @author : Yac
 * @date : 2023/7/20
 * @projectTeam :
 */
public class BoyTest {
    public static void main(String[] args) {
        Boy b1=new Boy("杰克",23);
        Girl g1=new Girl("玛瑞亚",22);
        g1.marry(b1);
        b1.shout();
        Girl g2=new Girl("茱莉亚",18);
        int compare=g1.compare(g2);
            if (compare>0){
                System.out.println(g1.getName()+"大");
            } else if (compare<0) {
                System.out.println(g2.getName()+"大");
            }else {
                System.out.println("一样大");
            }


    }
}
