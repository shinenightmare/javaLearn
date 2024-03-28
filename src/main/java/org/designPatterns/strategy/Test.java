package org.designPatterns.strategy;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new Addition());
        int result1 = calculator.performOperation(5, 3);
        System.out.println("Addition Result: " + result1);

        calculator.setOperation(new Subtraction());
        int result2 = calculator.performOperation(10, 4);
        System.out.println("Subtraction Result: " + result2);

        calculator.setOperation(new Multiplication());
        int result3 = calculator.performOperation(6, 2);
        System.out.println("Multiplication Result: " + result3);
    }
}
