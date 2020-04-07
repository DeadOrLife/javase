package com.wz.deadorlife.overClass.creal;

/**
 *最好的办法是除了内存意以外，不能依赖垃圾回收器去做任何事情，如果需要进行清理，最好是编写
 * 你自己的清理方法 但不要使用 finalize()方法
 * @author wz
 */
public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i){
        super(i+1);
        for(int j=0;j<lines.length;j++){
            lines[j] = new Line(j,j*j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined constructor");
    }

    @Override
    void dispose(){
        System.out.println("CADSystem.dispose()");
        t.dispose();
        c.dispose();
        for (int i=lines.length-1;i>=0;i--){
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {

        }finally {
            x.dispose();
        }
    }
}

class Shape{
    Shape(int i){
        System.out.println("Shape Constructor");
    }
    void dispose(){
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape{
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    @Override
    void dispose(){
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape{
    Triangle(int i){
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape{
   private int start,end;
   Line(int start,int end){
    super(start);
    this.start = start;
    this.end = end;
       System.out.println("Drawing Line "+start+","+end);
   }
   @Override
   void dispose(){
       System.out.println("Erasing Line "+start+","+end);
       super.dispose();
   }
}
