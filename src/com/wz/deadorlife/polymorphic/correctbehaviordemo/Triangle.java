package com.wz.deadorlife.polymorphic.correctbehaviordemo;

/**
 * 三角形
 * @author wz
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase()");
    }
}
