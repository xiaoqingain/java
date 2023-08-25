package com.atguigu._abstract.exer3;

/**
 * @author : Yac
 * @date : 2023/8/6
 */
public class GraphicTest {
    public static void main(String[] args) {
       Graphic[] arr=new Graphic[4];
       arr[0]=new Rectangle(2,4);
       arr[1]=new Rectangle(1,1);
       arr[2]=new Circle(4.5);
       arr[3]=new Circle(2.0);

       //使用冒泡排序方法进行排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
               if (arr[j].area()<arr[j+1].area()){
                   Graphic temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }
        }
        //遍历输出图形信息
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].detail());
        }



    }

}
