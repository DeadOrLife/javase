package com.wz.deadorlife.generic.tuple;

/**
 * 2维元组
 *
 * 通常，元组可以具有任意长度，同时，元祖的对象可以是任意不同的类型
 * @author jamesbean
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
