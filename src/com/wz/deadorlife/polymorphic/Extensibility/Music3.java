package com.wz.deadorlife.polymorphic.Extensibility;

import com.wz.deadorlife.polymorphic.Note;

/**
 * @author wz
 */
public class Music3 {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e){
        for (Instrument i:e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestar = {new Wind(),new Percussion(),new Stirnged(),new Woodwind(),new Barss()};
        tuneAll(orchestar);
    }
}
