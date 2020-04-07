package com.wz.deadorlife.overClass.chosecombinatorialgrammar;

/**
 * 在组合与继承之间进行选择
 *
 * is-a(是一个) 继承
 * has-a(有一个) 组合
 * @author wz
 */
public class Car {
    private Engine engine = new Engine();
    private Wheel[] wheels = new Wheel[4];
    private Door left = new Door(),right = new Door();
    public Car(){
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
    }
}

/**
 * 引擎
 */
class Engine{
    public void start(){}
    public void rev(){}
    public void stop(){}
}

/**
 * 车轮
 */
class Wheel{
    public void inflate(int psi){}
}

/**
 * 车窗
 */
class Windows{
    public void rollup(){}
    public void rooldown(){}
}

/**
 * 车门
 */
class Door{
    public Windows window = new Windows();
    public void open(){}
    public void close(){}
}