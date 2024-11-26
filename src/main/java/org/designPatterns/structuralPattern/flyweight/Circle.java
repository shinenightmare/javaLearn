package org.designPatterns.structuralPattern.flyweight;

public class Circle implements Shape{
    private Color color;
    public Circle(Color color){
        this.color=color;
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color.getName() + " circle at (" + x*color.getIndex() + "," + y*color.getIndex() + ")");
    }
}
