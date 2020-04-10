package com.wz.deadorlife.polymorphic.Extensibility;

import com.wz.deadorlife.polymorphic.Note;

/**
 * 基类
 * @author wz
 */
public class Instrument {
    void play(Note n){
        System.out.println("Instrument play() "+ n);
    }
    String what(){ return "Instrument";}
    void adjust(){
        System.out.println("Instrument adjust ");
    }
}
