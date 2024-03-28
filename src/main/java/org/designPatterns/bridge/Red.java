package org.designPatterns.bridge;

public class Red implements Color{
    @Override
    public void applyColor() {
        System.out.println("applying red color");
    }
}
