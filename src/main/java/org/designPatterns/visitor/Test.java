package org.designPatterns.visitor;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        AreaCalculator areaCalculator = new AreaCalculator();
        rectangle.accept(areaCalculator);
        System.out.println("Total area: " + areaCalculator.getArea());
        circle.accept(areaCalculator);
        System.out.println("Total area: " + areaCalculator.getArea());
    }
}
