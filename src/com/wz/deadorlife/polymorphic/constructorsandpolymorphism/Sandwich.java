package com.wz.deadorlife.polymorphic.constructorsandpolymorphism;

/**
 * 1.调用基类的构造器
 * 2.按照声明顺序调用成员的初始化方法
 * 3.调用导出类构造器的主体
 * @author wz
 */
public class Sandwich extends PortableLunch{
    //执行2
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    //执行3
    public Sandwich(){
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        //执行1
        new Sandwich();
    }
}

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}


