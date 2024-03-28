package org.designPatterns.strategy;

class Addition implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
