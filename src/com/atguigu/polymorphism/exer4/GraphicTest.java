package com.atguigu.polymorphism.exer4;

/**
 * @author : Yac
 * @date : 2023/7/30
 */
public class GraphicTest {
    public static void main(String[] args) {
        Graphic[] arr=new Graphic[4];

        /*引用多态
        arr[i]编译时是Graphic类型，
        实际运行时是Circ或Rectangle类型
         */
        arr[0]=new Circle(1.5);
        arr[1]=new Circle(1.5);
        arr[2]=new Rectangle(1,3);
        arr[3]=new Rectangle(2,2);
        for (int i = 0; i < arr.length; i++) {
            /*
            通过arr[i]可以调用area方法
            因为编译时arr[i]是Graphic类型，它有area方法
            但是运行执行的是Graphic或Rectangle重写的area方法
           */
            System.out.println(arr[i].area());
        }

    }
}
