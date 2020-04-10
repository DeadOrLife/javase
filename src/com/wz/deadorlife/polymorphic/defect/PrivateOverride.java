package com.wz.deadorlife.polymorphic.defect;

/**
 * 覆盖 私有方法
 *
 * 1、在子类中可以根据需要对从基类中继承来的方法进行重写。
 *
 * 2、重写的方法和被重写的方法必须具有相同方法名称、参数列表和返回类型。(注：返回值可以为父类中返回值的子类型.参数若为子类，则不是重写是重载)
 *
 * 3、重写方法不能使用比被重写的方法更严格的访问权限。
 *
 * 4、重写方法不能声明抛出比被重写方法范围更大的异常类型。
 * @author wz
 */
public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po =new PrivateOverride();
        po.f();

        PrivateOverride pod =new Derived();
        pod.f();
    }
}

class Derived extends PrivateOverride{

//    @Override
    private void f(){
        System.out.println("public f()");
    }
}
