package com.wz.deadorlife.overClass.hidename;

/**
 *
 * 屏蔽名称
 * @author wz
 */
public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0f);
        bart.doh(new Milhouse());
    }
}

class Homer{
    char doh(char c){
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("doh(float)");
        return 1.1f;
    }
}

class Milhouse{}

class Bart extends Homer{
    void doh(Milhouse m){
        System.out.println("doh(Milhouse)");
    }
}

class Lisa extends Homer{
    //Method does not override method from its superclass
//    @Override
//    void doh(Milhouse m){
//        System.out.println("doh(Milhouse)");
//    }
}
