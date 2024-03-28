package org.designPatterns.visitor;

interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
