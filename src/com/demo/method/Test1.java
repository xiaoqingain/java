package com.demo.method;

public class Test1 {
    public static void main(String[] args) {
        add(4);
        add(10);
        add(50);


    }
    public static void add(int sum){
        for (int i=1;i<=sum;i++){
            for (int j=1;j<=i;j++){

                System.out.print("*");
            }


            System.out.println();
        }
    }
}
