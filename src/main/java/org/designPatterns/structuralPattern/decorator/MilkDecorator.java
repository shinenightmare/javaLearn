package org.designPatterns.structuralPattern.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decorateCoffee) {
        super(decorateCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

    @Override
    public String description() {
        return super.description() + ", with Milk";
    }
}
