package com.wz.deadorlife.execute.test;

/**
 * 输出1-100
 * 到99的时候break
 * @author wz
 */
public class ForPrint {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i==99){
                break;
            }
            System.out.print(i + " ");
        }
    }
}
