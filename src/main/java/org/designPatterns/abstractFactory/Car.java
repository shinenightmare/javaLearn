package org.designPatterns.abstractFactory;

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("car drive on the road");
    }
}
