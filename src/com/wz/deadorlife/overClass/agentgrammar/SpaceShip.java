package com.wz.deadorlife.overClass.agentgrammar;

/**
 * @author wz
 */
public class SpaceShip extends SpaceShipControls{
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip("NSEA Protector");
        spaceShip.forward(100);
    }
}
