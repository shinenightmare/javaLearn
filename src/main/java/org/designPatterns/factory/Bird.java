package org.designPatterns.factory;

public class Bird implements Action,Shape {
    @Override
    public void move() {
        System.out.println("bird can fly");
    }

    @Override
    public void food() {
        System.out.println("bird eat crop");
    }

    @Override
    public void limb() {
        System.out.println("bird have wings");
    }
}
