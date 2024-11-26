package org.designPatterns.behaviorPattern.interpreter;

public class NumberExpression implements Expression{
    private int value;

    public NumberExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
