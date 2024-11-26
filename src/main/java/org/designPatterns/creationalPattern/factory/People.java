package org.designPatterns.creationalPattern.factory;

public class People implements Action,Shape{
    @Override
    public void move() {
        System.out.println("People can walk");
    }

    @Override
    public void food() {
        System.out.println("people eat bird and fish");
    }

    @Override
    public void limb() {
        System.out.println("people have arms");
    }
}
