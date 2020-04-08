package com.wz.deadorlife.overClass.finalkeywords;

/**
 * final参数
 * java允许在参数列表中以声明的方式将参数指明为final，这意味着你无法在方法中
 * 更改参数引用所指向的对象
 * @author wz
 */
public class FinalArguments {
    void with(final Gizmo g){
//        g = new Gizmo();
    }
    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }

    //基本类型的参数被指明为final是所出现的结果
    //你可以读取参数 但是无法修改参数
//    void f(final int i){
//        i++;
//    }

    int g(final int i){
        return i+1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.with(null);
        bf.without(null);
        System.out.println(bf.g(2));

    }
}

class Gizmo{
    public void spin(){}
}
