package com.wz.deadorlife.generic.tuple;

/**
 * 为了使用元组，你只需要要定义一个适合的元组，将其作为方法的返回值，然后在return句中创建该元组，并返回即可
 * @author jamesbean
 */
public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<String, Integer>("hi",47);
    }

    static ThreeTuple<Amphibian,String,Integer> g(){
        return new ThreeTuple<Amphibian, String, Integer>(
                new Amphibian(),"hi",47);
    }

    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return new FourTuple<Vehicle, Amphibian, String, Integer>(
                new Vehicle(),new Amphibian(),"hi",47);
    }

    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(
                new Vehicle(),new Amphibian(),"hi",47,11.1
        );
    }

    static SixTuple<Vehicle,Amphibian,String,Integer,Double,Double> l(){
        return new SixTuple<Vehicle, Amphibian, String, Integer, Double, Double>(
                new Vehicle(),new Amphibian(),"hi",47,11.1,2.2
        );
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
//        ttsi.first="1"; //Compile error final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(l());

    }

}

class Amphibian{}
class Vehicle{}