package com.wz.deadorlife.polymorphic.correctbehaviordemo;

/**
 * 基类
 * java中的所有方法都是通过动态绑定的 实现多态
 * @author wz
 */
public class Shape {

    public void draw(){

    }

    public void erase(){

    }

    public void printShape(){
        System.out.println("Shape printShape()");
    }
}
