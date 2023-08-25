package com.atguigu._final.exer1;

/**
 * @author : Yac
 * @date : 2023/8/5
 */
public  class Demo {
    final int A=1;
    final int B;
    static final int C;
    static final int D=4;
    final int E;


    {
        B=2;
    }
    static {
        C=3;
    }
public Demo(int e){
        E=e;
}

    @Override
    public String toString() {
        return "Demo{" +
                "A=" + A +
                ", B=" + B +
                ", E=" + E +
                '}';
    }
}
