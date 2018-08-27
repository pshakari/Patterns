package main.java.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
        shapeMaker.drawCircle();
    }
}
