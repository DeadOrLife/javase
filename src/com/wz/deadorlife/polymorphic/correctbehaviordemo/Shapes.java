package com.wz.deadorlife.polymorphic.correctbehaviordemo;

/**
 * 思路：
 * 根据工厂获取到随机的子类对象--->将对象放入到数组中--->遍历调用指定的方法
 * @author wz
 */
public class Shapes {

   private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i=0;i<s.length;i++){
            s[i] = gen.next();
        }
        for (Shape shp : s){
            shp.draw();
            shp.erase();
            shp.printShape();
        }
    }
}
