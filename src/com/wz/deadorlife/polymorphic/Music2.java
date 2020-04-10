package com.wz.deadorlife.polymorphic;

/**
 *  Music与Music2对比 写法的优势
 *  两者都可以达到目的  但是Music2的做法 显得有点冗余 对每个方法 都得进行对应的引用入参
 * @author wz
 */
public class Music2 {
//    public static void tune(Instrument i){
        //重写的父类(基类)方法 所以调用子类中的对应的方法
//        i.play(Note.MIDDLE_C);
        //调用父类的方法  由继承而来
//        i.play2(Note.MIDDLE_C);
//    }

    //如果入参类型不是他们的基类 那么 需要写三个重载方法

    public static void tune(Wind i){
        //重写的父类(基类)方法 所以调用子类中的对应的方法
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Stringed i){
        //重写的父类(基类)方法 所以调用子类中的对应的方法
        i.play(Note.MIDDLE_C);
    }
    public static void tune(Brass i){
        //重写的父类(基类)方法 所以调用子类中的对应的方法
        i.play(Note.MIDDLE_C);
    }


    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}

class Stringed extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Stringed play()");
    }
}

class Brass extends Instrument{
    @Override
    public void play(Note n){
        System.out.println("Brass play()");
    }
}