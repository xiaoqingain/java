package com.atguigu.polymorphism.exer7;

/**
 * @author : Yac
 * @date : 2023/7/31
 */
public class ShapTest {
    public static void main(String[] args) {
        Shap[] shaps=new Shap[3];
        shaps[0]=new Circle(2.0);
        shaps[1]=new Rectangle(3.0,4.5);
        shaps[2]=new Triangle(3,4,5);

        for (int i = 0; i < shaps.length; i++) {
            for (int j=0;j< shaps.length-1;j++){
                boolean  flag=false;
                if (shaps[j].area()>shaps[j+1].area()){
                    flag=true;
                }else if (shaps[j].area()==shaps[j+1].area()){
                    if (shaps[j].perimeter()>shaps[j+1].perimeter()){
                        flag=true;
                    }
                }
                if (flag){
                    Shap temp=shaps[j];
                    shaps[j]=shaps[j+1];
                    shaps[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < shaps.length; i++) {
            System.out.println(shaps[i].detail());
        }
    }
}
