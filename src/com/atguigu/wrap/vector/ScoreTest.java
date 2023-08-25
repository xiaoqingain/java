package com.atguigu.wrap.vector;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author : Yac
 * @date : 2023/8/16
 */
public class ScoreTest {
    public static void main(String[] args) {
        Vector v=new Vector();
        Scanner sc = new Scanner(System.in);
        int max=0;
        while (true){
            System.out.println("请输入学生成绩（已负号代表结束）：");
            int intScore= sc.nextInt();
            if (intScore<0){
                break;
            }

            // 装箱：int-->Integer
            // Integer score = Integer.valueOf(intScore);
            // 添加学生成绩到容器v中
            // v.addElement(score);

            //自动装箱
            v.addElement(intScore);
            if (max<intScore){
                max=intScore;
            }



        }
        System.out.println("最高分："+max);
        for (int i = 0; i < v.size(); i++) {

         Object objScore=v.elementAt(i);
//         Integer integer=(Integer) objScore;
//         //拆箱
//            int score=integer.intValue();
            //自动拆装
            int score=(Integer)objScore;
           char grade;
            if (max-score<=10){
                grade='A';
            } else if (max-score<=20) {
                grade='B';
            } else if (max-score<=30) {
                grade='C';

            }else {
                grade='D';
            }

            System.out.println("student "+i+"score is "+score+"grade is "+grade);
        }
        sc.close();
    }
}
