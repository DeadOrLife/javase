package com.wz.deadorlife.polymorphic;

/**
 * @author wz
 */
public class Wind extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Wind play() "+n);
    }
}
