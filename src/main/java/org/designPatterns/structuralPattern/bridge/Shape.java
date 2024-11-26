package org.designPatterns.structuralPattern.bridge;

public abstract class Shape {
    protected Color color;
    public Shape (Color color){
        this.color=color;
    }
    abstract void draw();
}
