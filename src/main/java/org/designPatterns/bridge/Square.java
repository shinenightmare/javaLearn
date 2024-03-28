package org.designPatterns.bridge;

class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("Drawing a square. ");
        color.applyColor();
    }
}
