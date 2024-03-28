package org.designPatterns.abstractFactory;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println("plane fly in the sky");
    }
}
