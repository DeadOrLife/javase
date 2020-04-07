package com.wz.deadorlife.overClass.upward;

/**
 * 向上转型
 * @author wz
 */
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}

class Instrument {
    public void play(){}
    static void tune(Instrument i){
        i.play();
    }
}
