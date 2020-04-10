package com.wz.deadorlife.polymorphic.Extensibility;

import com.wz.deadorlife.polymorphic.Note;

/**
 * @author wz
 */
public class Woodwind extends Wind {
    @Override
    void play(Note n){
        System.out.println("Woodwind play() "+ n);
    }
    @Override
    void adjust(){
        System.out.println("Woodwind adjust ");
    }
}
