package org.designPatterns.structuralPattern.bridge;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a circle");
        color.applyColor();
    }
    public Circle(Color color){
        super(color);
    }
}
