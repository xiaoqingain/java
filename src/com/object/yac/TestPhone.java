package com.object.yac;

public class TestPhone {
    public static void main(String[] args) {
        /*
        定义数组存储3部手机对象。
        手机的属性：品牌，价格，颜色。
        要求，计算出三部手机的评价价格
         */
        Phone []arr=new Phone[3];
        Phone p1=new Phone("华为p50:",5000,"黑色");
        Phone p2=new Phone("小米13:",3200,"白色");
        Phone p3=new Phone("苹果13:",6500,"月光色");
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone=arr[i];
            System.out.println(phone.getBrand()+","+phone.getPrice()+","+phone.getColour());
           sum+= phone.getPrice();
        }
        int avg=sum/arr.length;
        System.out.println(avg);
    }
}
