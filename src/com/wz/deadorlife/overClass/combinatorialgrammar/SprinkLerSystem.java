package com.wz.deadorlife.overClass.combinatorialgrammar;

/**
 * @author wz
 */
public class SprinkLerSystem {

    private  String value1,value2,value3,value4;
    private WaterSource waterSource = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinkLerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", waterSource=" + waterSource +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinkLerSystem sprinkLerSystem = new SprinkLerSystem();
        System.out.println(sprinkLerSystem);
    }
}
