package main.java.structural.facade;

public class ShapeMaker {
    private Shape square;
    private Shape rectangle;
    private Shape circle;

    public ShapeMaker() {
        this.square = new Square();
        this.rectangle = new Rectangle();
        this.circle = new Circle();
    }

    public void drawSquare() {
        this.square.draw();
    }

    public void drawRectangle() {
        this.rectangle.draw();
    }

    public void drawCircle() {
        this.circle.draw();
    }

}
