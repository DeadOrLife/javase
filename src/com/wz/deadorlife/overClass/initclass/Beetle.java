package com.wz.deadorlife.overClass.initclass;

/**
 * 初始化及类的加载
 * 所有的static对象和static代码段都会在加载的时依程序中的顺序 书写顺序
 * 定义为static的东西只会被初始化一次
 * @author wz
 */
public class Beetle extends Insect{
    private int k = printlnInt("Beetle Insect.printlnInt(k)");

    public Beetle(){
        System.out.println("k = "+k);
        System.out.println("j = "+j);
    }
    private int x2 = printlnInt("Beetle Insect.printlnInt(x2)");

    public static void main(String[] args) {
        System.out.println("开始初始化");
        Beetle b = new Beetle();
    }

}

class Insect{
    private int i = 9;
    protected int j;
    Insect(){
//        Object[] a = (new Object[]{i,j});
        System.out.println("Insect i = "+i);
        System.out.println("Insect j = "+j);
        j = 39;
    }

    private static int x1 =printlnInt("");
    static int printlnInt(String s){
        System.out.println(s);
        return 47;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
