package com.wz.deadorlife.overClass.combinatorialgrammar;

/**
 * 组合语法
 *
 * @author wz
 */
public class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }

}
