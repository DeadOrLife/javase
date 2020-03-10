package com.wz.deadorlife.generic.holder;

/**
 * 一个只能持有单个对象的类
 * 这个类的重用性就不怎么样了，它无法持有其他类型的对象
 * @author wz
 */
public class Holder1 {
    private Automobile a;
    public Holder1(Automobile a) {
        this.a = a;
    }
    Automobile get(){
        return  a;
    }
}

class Automobile{}