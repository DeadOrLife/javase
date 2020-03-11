package com.wz.deadorlife.execute.test;

/**
 *
 * 打印 1到100
 * @author jamesbean
 */
public class PrintOneToHundred {
    public static void main(String[] args) {
        //for循环
        for(int i = 1; i<=100; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        //while循环
        int j = 1;
        while (verification(j)){
            System.out.print(j+" ");
            j++;
        }

        System.out.println();

        //do-while循环
        int k = 1;
        do {
            System.out.print(k+" ");
            k++;
        }while (verification(k));

    }

    /**
     * 验证是否为100
     * @param val
     * @return
     */
    static boolean verification(int val){
        //当val为100当时候返回false 跳出循环
        if (val > 100){
            return false;
        }else{
            return true;
        }
    }
}
