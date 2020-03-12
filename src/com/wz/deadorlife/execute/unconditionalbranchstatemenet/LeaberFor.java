package com.wz.deadorlife.execute.unconditionalbranchstatemenet;

/**
 * goto的用法
 * @author wz
 */
public class LeaberFor {

    public static void main(String[] args) {
        int i = 0;
        outer:
        for (;true;){
            inner:
            for(; i < 10; i++){
                System.out.print(i + " ");
                if (i == 2){
                    System.out.println("continue");
                    continue;
                }
                if (i == 3){
                    System.out.println("break");
                    i++;
                    break ;
                }
                if (i == 7){
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8){
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3){
                        System.out.println("continue innner");
                        continue inner;
                    }
                }
            }
        }
    }




}
