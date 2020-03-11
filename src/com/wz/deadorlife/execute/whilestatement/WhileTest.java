package com.wz.deadorlife.execute.whilestatement;

/**
 * while do-while和for用来控制循环，有时候将它们划分维迭代语句
 * 语句会重复只想，知道起控制作用的布尔表达式为false时停止
 *
 * while(Boolean-expression)
 *  statement
 *
 * @author jamesbean
 */
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        while (condition()){
            System.out.println("Inside while");
        }
        System.out.println("Exited while");
    }

}
