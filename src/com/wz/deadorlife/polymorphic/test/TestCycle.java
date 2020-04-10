package com.wz.deadorlife.polymorphic.test;

/**
 * @author wz
 */
public class TestCycle {


    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();
        ride(u);
        ride(b);
        ride(t);


    }

    public static void ride(Cycle i){
        //重写的父类(基类)方法 所以调用子类中的对应的方法
        i.ride(i);
    }
}
