package org.designPatterns.visitor;
interface Shape {
    void accept(ShapeVisitor visitor);
}
