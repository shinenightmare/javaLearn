package org.designPatterns.decorator;

public class GoodCoffee implements Coffee{
    @Override
    public double cost() {
        return 5.0;
    }

    @Override
    public String description() {
        return "this is a good coffee";
    }
}
