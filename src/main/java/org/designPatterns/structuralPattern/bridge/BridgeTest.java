package org.designPatterns.structuralPattern.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Color red=new Red();
        Shape circle=new Circle(red);
        circle.draw();

        Color blue=new Blue();
        Shape square=new Square(blue);
        square.draw();
    }
}
