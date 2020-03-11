package com.wz.deadorlife.execute.test;

/**
 * 素数
 *
 * 只能被其自身和1整除，而不能被其他数字整除的整数
 *
 * 只要存能被其他数整除的数就不是素数
 * @author jamesbean
 */
public class PrimeNumber {

    public static void main(String[] args) {

        //计数 2-100之内有多少个素数
        int count = 0;
        for (int i = 2; i < 100; i++) {
            boolean flag = false;
            for (int j = 2; j < 100; j++) {
                if (i % j == 0 && i != j){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println(count);

    }

}
