package com.wz.deadorlife.polymorphic.defect;

/**
 *
 * @author wz
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        //0
        System.out.println(sup.field);
        //1
        System.out.println(sup.getField());
        Sub sub = new Sub();
        //1
        System.out.println(sub.field);
        //1
        System.out.println(sub.getField());
        //0
        System.out.println(sub.getSuperField());
    }
}
class Super{
    public int field = 0;
    public int getField(){
        return field;
    }
}
class Sub extends Super{
    public int field = 1;
    @Override
    public int getField(){
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}
