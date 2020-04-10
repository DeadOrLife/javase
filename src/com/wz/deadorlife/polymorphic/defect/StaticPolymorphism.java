package com.wz.deadorlife.polymorphic.defect;

/**
 * 静态方法中可以调用静态方法 但是不能直接调用非静态方法  可以通过创建对象再去调用
 * 非静态方法 直接调用静态方法 或者 通过 类名.方法
 *
 * 静态方法是属于类的  所有不用通过对象去调用静态方法
 * @author wz
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(StaticSuper.staticGet());
        System.out.println(sup.dynamicGet());
    }

    public void noStaticMethod(){
        StaticMethod();
        StaticPolymorphism.StaticMethod();
    }

    public static void StaticMethod(){}
}



class StaticSuper{
    public static String staticGet(){
        return "Base staticGet()";
    }
    public String dynamicGet(){
        return "Base dynamicGet()";
    }

}

class StaticSub extends StaticSuper{

    public static String staticGet(){
        return "StaticSub staticGet()";
    }
    @Override
    public String dynamicGet(){
        return "StaticSub dynamicGet()";
    }
}
