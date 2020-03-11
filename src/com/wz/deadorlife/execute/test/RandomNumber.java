package com.wz.deadorlife.execute.test;

import java.util.Random;

/**
 * 产生指定的的随机数，对于每个随机值，使用if-else语句来将
 * 其分类大于小于 或者等于它随机生产的值
 * 说白的就是比价执之前产生的随机
 * @author jamesbean
 */
public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();
        //声明两个变量并且赋予0
        int a,b = 0;
        for (int i = 0; i < 25; i++){
            //生成随机数0-99
            a = random.nextInt(100);
            if (i == 0){
                System.out.println("a="+a);
            }else {
                if (a == b){
                    System.out.println(a+"等于"+b);
                }else if(a > b){
                    System.out.println(a+"大于"+b);
                }else {
                    System.out.println(a+"小于"+b);
                }
            }
            //将a赋值给b 是因为a再次循环的时候重新生成值 并且用变量b来接收上次a生成的值
            b = a;

        }
    }
}
