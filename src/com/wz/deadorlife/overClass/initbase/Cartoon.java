package com.wz.deadorlife.overClass.initbase;


class Art {
    Art(){
        System.out.println("Art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
        System.out.println("Drawing constructor");
    }
}
/**
 *
 * @author wz
 */
public class Cartoon extends Drawing{
    public Cartoon(){
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}