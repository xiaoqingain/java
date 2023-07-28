package com.demo.CI;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("---------商品人口--------");
        double apple=5.5;
        double pear=3.3;
        double banana=7.0;
        System.out.println("1.苹果"+apple);
        System.out.println("2.梨子"+pear);
        System.out.println("3.香蕉"+banana);

        System.out.println("请输入您需要购买的商品");
        String fag="Y";
        Scanner sc=new Scanner(System.in);
        int sum= sc.nextInt();

        while (fag.equals("Y")){


            switch (sum){
                case 1:
                    System.out.println("hfd");
                    int number= sc.nextInt();
                    System.out.println("请输入你需要购买的苹果");
                    double sumapple=apple*number;
                    System.out.println(sumapple);

                    break;
                case 2:
                    System.out.println("梨子");
                    int numberpear= sc.nextInt();
                    System.out.println("请输入你需要购买的苹果");
                    double sumpear=pear*numberpear;
                    System.out.println(sumpear);
                    break;
                case 3:
                    System.out.println("香蕉");
                    int numberbanana= sc.nextInt();
                    System.out.println("请输入你需要购买的香蕉");
                    double sumbanana=banana*numberbanana;
                    System.out.println(sumbanana);
                    break;

                default:
                    System.out.println("您输入的编号不正确");
            }
            String ff=sc.next();
            System.out.println("您是否好要继续购买");

        }
//        /
    }
}
