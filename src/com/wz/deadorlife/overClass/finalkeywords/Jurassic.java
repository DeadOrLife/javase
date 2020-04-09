package com.wz.deadorlife.overClass.finalkeywords;

/**
 * final修饰类的时候 静止类的继承 且 类中的所有方法都是隐式指定为final的
 * 当然final类中的方法添加final 这种做法可行 但是没有意义
 * @author wz
 */
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}

class SmallBrain{}

final class Dinosaur{
    int i = 7;
    int j = i;
    SmallBrain x = new SmallBrain();
    void f(){}
}