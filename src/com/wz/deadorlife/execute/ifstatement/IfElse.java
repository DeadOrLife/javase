package com.wz.deadorlife.execute.ifstatement;

/**
 * if-else 语句是控制流程的最基本的形式，其中的else是可选的
 *
 * if(Boolean-expression)
 *  statement
 *
 * if(Boolean-expression)
 *  statement
 * else
 *  statement
 *
 * @author jamesbean
 */
public class IfElse {
    static int result = 0;
    static void test(int testval,int target){
        if (testval > target) {
            result = +1;
        } else if(testval < target) {
            result = -1;
        } else {
            result = 0;
        }
    }

    public static void main(String[] args) {
        test(10,5);
        System.out.println(result);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);

    }



}
