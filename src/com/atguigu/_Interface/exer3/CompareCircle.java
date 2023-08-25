package com.atguigu._Interface.exer3;

/**
 * @author : Yac
 * @date : 2023/8/8
 */
public class CompareCircle extends Circle implements CompareObject{
    public CompareCircle() {
    }

    public CompareCircle(double record) {
        super(record);
    }
    /**
     * 根据半径大小，比较对象的大小
     */

    @Override
    public int compareTo(Object o) {
        if (this==o){
            return 0;
        }
        if (o instanceof CompareObject ){
            CompareCircle c=(CompareCircle )o;
          return Double.compare(this.getRecord(),c.getRecord());
        }else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
