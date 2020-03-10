package com.wz.deadorlife.generic.tuple;

/**
 * 我们可以利用继承的机制实现长度更长的元组
 *
 * 3维元组
 * @author jamesbean
 */
public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.third = c;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "first=" + first +
                ", second=" + second +
                ",third=" + third +
                '}';
    }
}
