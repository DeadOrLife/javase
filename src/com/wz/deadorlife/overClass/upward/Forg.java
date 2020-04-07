package com.wz.deadorlife.overClass.upward;

/**
 * 向上转型
 * @author wz
 */
public class Forg extends Amphibian{
    public static void main(String[] args) {
        Forg forg = new Forg();
        forg.test(forg);
    }
    @Override
    public void testParam(){
        System.out.println("Forg testParam()");
    }
}

class Amphibian{
    public void testParam(){
        System.out.println("Amphibian testParam()");
    }
    public void test(Amphibian amphibian){
        amphibian.testParam();
        System.out.println("Amphibian test()");
    }
}
