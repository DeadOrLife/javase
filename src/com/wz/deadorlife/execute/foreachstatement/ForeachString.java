package com.wz.deadorlife.execute.foreachstatement;

/**
 *
 * @author jamesbean
 */
public class ForeachString {
    public static void main(String[] args) {
        //返回一个char数组 进行遍历输出
        for (char c: "an african swallow".toCharArray()) {
            System.out.print(c+" ");
        }
    }
}
