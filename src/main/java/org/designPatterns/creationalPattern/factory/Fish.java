package org.designPatterns.creationalPattern.factory;

public class Fish implements Action,Shape{
    @Override
    public void move() {
        System.out.println("Fish can swim");
    }

    @Override
    public void food() {
        System.out.println("Fish eat dirt");
    }

    @Override
    public void limb() {
        System.out.println("fish have fin");
    }
}
