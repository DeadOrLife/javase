package com.wz.deadorlife.polymorphic.correctbehaviordemo;

/**
 * 圆形
 * @author wz
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase()");
    }
}
