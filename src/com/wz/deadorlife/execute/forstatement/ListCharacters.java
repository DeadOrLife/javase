package com.wz.deadorlife.execute.forstatement;

/**
 * for(initializtion;Boolean-expression;step)
 *  statement
 *
 * 无穷循环
 * for(;;)与while(true)
 * @author jamesbean
 */
public class ListCharacters {
    public static void main(String[] args) {
        for(char i = 0; i < 128;i++){
            //判断是否为小写字符
            if(Character.isLowerCase(i)){
                System.out.println("小写value:"+(int)i +" character:"+i);
            }
            //判断是否为大写字符
            if(Character.isUpperCase(i)){
                System.out.println("大写value:"+(int)i +" character:"+i);
            }

            System.out.print(" "+i);
        }
    }

}
