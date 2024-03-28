package org.designPatterns.strategy;

class Subtraction implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}
