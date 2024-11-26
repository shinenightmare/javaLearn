package org.designPatterns.structuralPattern.decorator;

public class DecoratorTest {
    public static void main(String[] args) {

        Coffee badCoffee=new BadCoffee();
        System.out.println("this coffee cost:"+badCoffee.cost()+"; description:"+badCoffee.description());
        badCoffee=new MilkDecorator(badCoffee);
        badCoffee.description();
        badCoffee.cost();
        System.out.println("this coffee cost:"+badCoffee.cost()+"; description:"+badCoffee.description());
    }
}
