package org.designPatterns.protoType;

public class ProtoTypeTest {
    public static void main(String[] args) {
        Shape circle=new Shape("circle");
        Shape clonedCircle = circle.clone();
        clonedCircle.setType("Cloned Circle");

        // 输出原型对象和克隆对象的类型
        System.out.println("Original Shape Type: " + circle.getType());
        System.out.println("Cloned Shape Type: " + clonedCircle.getType());
    }
}
