package com.wz.deadorlife.execute.switchstatement;

import java.util.Random;

/**
 * swtich的用法
 * @author wz
 */
public class VowelsAndConsonants {

    public static void main(String[] args) {

        // 创建随机数对象
        Random random = new Random(47);
        for (int i = 0; i < 100; i++){
            int c = random.nextInt(26)+'a';
            System.out.print((char)c + "," + c + ":");
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print("vowel");
                case 'y':
                case 'w':
                    System.out.print("vowelyw");
                    break;
                default:
                    System.out.println("consonant");

            }
        }
    }
}
