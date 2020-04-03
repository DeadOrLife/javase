package com.wz.deadorlife.overClass.initbase;

/**
 * 如果没有默认的基类构造器，或者想调用一个带参数的基类构造器
 * 就必须使用super显示地编写调用基类构造器的语句
 * @author wz
 */
public class Chess extends BoardGame{

    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}

class Game{
    Game(int i){
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor");
    }
}
