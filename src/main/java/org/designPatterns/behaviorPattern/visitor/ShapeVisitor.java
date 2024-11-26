package org.designPatterns.behaviorPattern.visitor;

interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
