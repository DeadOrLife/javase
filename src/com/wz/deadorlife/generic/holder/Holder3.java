package com.wz.deadorlife.generic.holder;

/**
 * 使用泛型的方式
 *
 * 泛型的概念：告诉编译器使用什么类型
 * @author wz
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a){ this.a = a; }
    public void set(T a){ this.a = a; }
    public T get(){ return a; }
    public Holder3(){}

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
        Automobile a = h3.get();
        new Holder3<>();

//        h3.set("a");//Error
//        h3.set(1);
    }
}
