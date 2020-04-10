package com.wz.deadorlife.polymorphic.Extensibility;

import com.wz.deadorlife.polymorphic.Note;

/**
 * @author wz
 */
public class Stirnged extends Instrument{
    @Override
    void play(Note n){
        System.out.println("Stirnged play() "+ n);
    }
    @Override
    String what(){ return "Stirnged";}
    @Override
    void adjust(){
        System.out.println("Stirnged adjust ");
    }
}
