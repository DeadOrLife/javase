package com.wz.deadorlife.overClass.finalkeywords;

import java.util.Arrays;
import java.util.Random;

/**
 * final常量
 * 1.一个永不改变的编译时的常量
 * 2.一个在运行时被初始化的值，而你不希望将它被改变
 * 数据、方法、类
 * 减轻了运行时候的负担
 * 该类常量必须是基本数据类型并且与final关键字表示
 * @author wz
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id){this.id=id;}
    private final int valueOne = 9;

    private static final int VALUE_TWO = 99;

    public static final int VALUE_THREE = 39;

    private final int i4 = rand.nextInt(20);
    static  final  int int_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    private final int[] a = {1,2,3,4,5,6};

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", valueOne=" + valueOne +
                ", i4=" + i4 +
                ", v1=" + v1 +
                ", v2=" + v2 +
                ", a=" + Arrays.toString(a) +
                '}';
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v2.i++;
//        fd1.valueOne++;
        fd1.v1 = new Value(9);
        for (int i=0;i<fd1.a.length;i++){
            fd1.a[i]++;
        }
        System.out.println(fd1);
        System.out.println("creating new funaldata");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }

}

class Value{
    int i;
    public Value(int i){this.i=i;}
}
