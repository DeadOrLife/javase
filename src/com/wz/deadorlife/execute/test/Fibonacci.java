package com.wz.deadorlife.execute.test;

import java.util.Scanner;

/**
 * 斐波那契数列
 * 前两个数之和等于第三个
 *
 * @author wz
 */
public class Fibonacci {

    public static void main(String[] args) {
       /* for (int i = 1; i <= 6; i++) {
            if (f(i) == i){
                System.out.println(i);
            }
        }*/

        //输出第n项的值
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第n项的值:");
        int n = Integer.parseInt(scan.nextLine().trim());
        System.out.println("f("+n+")="+f(n));
        //输出前n项所有数据 每10个换一行
        for(int i=1;i<=n;i++) {
            System.out.print(f(i) + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

        /**
         * 传入参数n  返回值类型为long,若为int可能出现溢出
         */
        public static int f(int n){
            //参数1或者2时
            if(n == 1 || n == 2){
                return 1;
            }else{
                return f(n - 1) + f(n - 2);
            }
        }

}
