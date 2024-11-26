package org.designPatterns.structuralPattern.bridge;

public class Red implements Color{
    @Override
    public void applyColor() {
        System.out.println("applying red color");
    }
}
