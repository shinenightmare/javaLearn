package org.designPatterns.structuralPattern.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee decorateCoffee) {
        super(decorateCoffee);
    }
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    @Override
    public String description() {
        return super.description() + ", with Sugar";
    }
}
