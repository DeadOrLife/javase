package com.wz.deadorlife.execute.initconstructor;

/**
 * 方法的重载
 *
 * 每个重载的方法都必须有一个独一无二的参数类型列表
 * @author wz
 */
public class OverLoad {
    int height;

    OverLoad(){
        System.out.println("无参重载:"+height);
    }
    OverLoad(int initHeight){
        this.height = initHeight;
        System.out.println("有参重载:"+height);
    }
    void info(){
        System.out.println("调用的info()");
    }
    void info(int val){
        System.out.println("调用了info(int val)"+val);
    }

    void info(int val,String str){
        System.out.println("调用了info(int val,String str)");
    }
    void info(String str,int val){
        System.out.println("调用了info(String str,int val)");
    }
    public static void main(String[] args) {

        OverLoad overLoad = new OverLoad();
        new OverLoad(20);
        overLoad.info();
        overLoad.info(1);
        //参数的顺序不同 也是重载的一种体现形式
        overLoad.info(1,"2");
        overLoad.info("2",1);
    }

}
