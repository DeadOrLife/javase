package com.wz.deadorlife.polymorphic.Extensibility;

import com.wz.deadorlife.polymorphic.Note;

/**
 * @author wz
 */
public class Percussion extends Instrument {
    @Override
    void play(Note n){
        System.out.println("Percussion play() "+ n);
    }
    @Override
    String what(){ return "Percussion";}
    @Override
    void adjust(){
        System.out.println("Percussion adjust ");
    }
}
