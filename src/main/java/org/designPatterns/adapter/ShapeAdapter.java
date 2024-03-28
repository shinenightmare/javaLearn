package org.designPatterns.adapter;

public class ShapeAdapter implements Shape{
    private IrregularShape irregularShape;

    public ShapeAdapter(IrregularShape irregularShape) {
        this.irregularShape = irregularShape;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        //自定义关系
        int x1=x+y;
        int x2=width;
        int y2=height;
        irregularShape.display(x1,x2,y2);
    }
}
