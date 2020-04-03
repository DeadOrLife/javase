package com.wz.deadorlife.overClass.combinatorialgrammar;

/**
 * @author wz
 */
public class Soap {

    private String s;
    public Soap(){
        System.out.println("Soap()");
        s = "Constructed";
    }
    @Override
    public String toString(){
        return s;
    }
}
