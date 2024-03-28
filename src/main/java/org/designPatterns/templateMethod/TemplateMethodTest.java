package org.designPatterns.templateMethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        AbstractClass template = new ConcreteClass();
        template.templateMethod();
    }
}
