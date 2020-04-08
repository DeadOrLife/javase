package com.wz.deadorlife.overClass.finalkeywords;

/**
 * 空白的final 定义时候未给初始值
 * @author wz
 */
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet poppet;

    BlankFinal(){
        j = i;
        poppet = new Poppet(1);
    }

    BlankFinal(int x){
        j = x;
        poppet = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

class Poppet{
    private int i;
    Poppet(int ii){
        i = ii;
    }
}

