package com.wz.deadorlife.polymorphic.correctbehaviordemo;

/**
 * 长方形
 * @author wz
 */
public class Square extends Shape{

    @Override
    public void draw() {
        System.out.println("Square draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square erase()");
    }
}
