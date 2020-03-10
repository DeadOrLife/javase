package com.wz.deadorlife.generic;

/**
 * 一个只能持有单个对象的类
 * 这个类的重用性就不怎么样了，它无法持有其他类型的对象
 *
 * 在Holder1的 基础上进行升级 使它可以满足其他类型的使用 在java SE5之后使用Object类型
 * @author wz
 */
public class Holder2 {
    private Object a;
    public Holder2(Object a) {
        this.a = a;
    }
    public void set(Object a){ this.a = a; }
    public Object get(){ return  a; }

    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile a = (Automobile) h2.get();
        h2.set("NOT an Automobile");
        String s = (String)h2.get();
        h2.set(1);
        Integer x  = (Integer) h2.get();
        System.out.println(a.toString());
        System.out.println(s);
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "Holder2{" +
                "a=" + a +
                '}';
    }
}

