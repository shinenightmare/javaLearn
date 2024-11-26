package org.designPatterns.structuralPattern.decorator;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decorateCoffee;

    public CoffeeDecorator(Coffee decorateCoffee) {
        this.decorateCoffee = decorateCoffee;
    }

    @Override
    public double cost() {
        return decorateCoffee.cost();
    }

    @Override
    public String description() {
        return decorateCoffee.description();
    }
}
