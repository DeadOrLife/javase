package com.wz.deadorlife.execute.foreachstatement;

import java.util.Random;

/**
 * foreach
 *
 * @author jamesbean
 */
public class ForEachFloat {

    public static void main(String[] args) {

        //遍历数组中的元素
        Random random = new Random(47);
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = random.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }

    }
}
