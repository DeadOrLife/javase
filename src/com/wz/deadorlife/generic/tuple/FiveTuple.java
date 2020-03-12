package com.wz.deadorlife.generic.tuple;

/**
 * 5维元组
 * @author jamesbean
 */
public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D>{
    public final E five;
    public FiveTuple(A a,B b,C c,D d,E e){
        super(a,b,c,d);
        this.five = e;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                ", fourth=" + fourth +
                "five=" + five +
                '}';
    }
}
