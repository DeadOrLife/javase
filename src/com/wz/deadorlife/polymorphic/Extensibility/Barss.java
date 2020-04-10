package com.wz.deadorlife.polymorphic.Extensibility;

import com.wz.deadorlife.polymorphic.Note;

/**
 * @author wz
 */
public class Barss extends Wind {
    @Override
    void play(Note n){
        System.out.println("Barss play() "+ n);
    }
    @Override
    void adjust(){
        System.out.println("Barss adjust ");
    }
}
