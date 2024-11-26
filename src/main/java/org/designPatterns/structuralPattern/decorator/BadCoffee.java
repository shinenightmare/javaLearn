package org.designPatterns.structuralPattern.decorator;

public class BadCoffee implements Coffee{
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "this is a badCoffee";
    }
}
