package com.wz.deadorlife.polymorphic;

/**
 * @author wz
 */
public class Music {
    public static void tune(Instrument i){
        //重写的父类(基类)方法 所以调用子类中的对应的方法
        i.play(Note.MIDDLE_C);

        //调用父类的方法  由继承而来
        i.play2(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
//        Instrument flute = new Instrument();
        tune(flute);
//        Wind play() MIDDLE_C
//        Instrument play()
    }
}

class Instrument{
    public void play(Note n){
        System.out.println("Instrument play()");
    }

    public void play2(Note n){
        System.out.println("Instrument play()");
    }
}