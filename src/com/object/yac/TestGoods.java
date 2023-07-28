package com.object.yac;

public class TestGoods {
    public static void main(String[] args) {
          /*
    定义数组储存三个商品对象
    商品属性：商品ID,商品名称,商品价格,商品库存。
    创建三个商品对象，并把商品对象粗存入到当前数组中

     */
        Goods []arr=new Goods[3];
        Goods g1=new Goods("001","苹果13",5000.0,100);
        Goods g2=new Goods("002","苹果Watch s8",2000.0,20);
        Goods g3=new Goods("003","小米笔记本",5000.0,50);
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            Goods goods=arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }

    }
    }
