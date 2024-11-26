package org.designPatterns.structuralPattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        IrregularShape irregularShape=new IrregularShape();
        Shape shapeAdapter=new ShapeAdapter(irregularShape);
        shapeAdapter.draw(1,3,4,6);
    }
}
