package com.wz.deadorlife.polymorphic.test;

/**
 * @author wz
 */
public class Cycle {
    public void ride(Cycle c){
        System.out.println("Cycle ride");
    }
}

class Unicycle extends Cycle{
    @Override
    public void ride(Cycle c) {
        System.out.println("Unicycle ride");
    }
}

class Bicycle extends Cycle{
    @Override
    public void ride(Cycle c) {
        System.out.println("Unicycle ride");
    }
}

class Tricycle extends Cycle{
    @Override
    public void ride(Cycle c) {
        System.out.println("Unicycle ride");
    }
}
