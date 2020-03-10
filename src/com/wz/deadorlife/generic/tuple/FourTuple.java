package com.wz.deadorlife.generic.tuple;

/**
 * 4维元组
 * @author jamesbean
 */
public class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C> {
    public final D fourth;
    public FourTuple(A a,B b,C c,D d){
        super(a,b,c);
        this.fourth = d;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ",fourth=" + fourth +
                '}';
    }
}
