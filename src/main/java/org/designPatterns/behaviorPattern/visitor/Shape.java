package org.designPatterns.behaviorPattern.visitor;
interface Shape {
    void accept(ShapeVisitor visitor);
}
