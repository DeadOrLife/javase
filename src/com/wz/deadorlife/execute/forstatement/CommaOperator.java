package com.wz.deadorlife.execute.forstatement;

/**
 * 逗号操作符
 *
 * 可以在for语句内定义多个变量，但是它们必须具有相同的类型
 *
 * @author jamesbean
 */
public class CommaOperator {

    public static void main(String[] args) {
        for (int i = 1,j= i + 10; i < 5; i++,j = i * 2) {
            System.out.println("i=" + i + " j=" + j);
        }
    }

}
