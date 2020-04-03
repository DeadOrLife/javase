package com.wz.deadorlife.overClass.extendgrammar;

public class Detergent extends Cleanser{
    @Override
    public void scrub(){
        append("Detergent.scrub()");
        super.scrub();
//        scrub();
    }
    public void foam(){
        append(" foam() ");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        Cleanser.main(args);
    }
}
