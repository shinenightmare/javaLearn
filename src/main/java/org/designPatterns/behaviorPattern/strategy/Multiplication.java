package org.designPatterns.behaviorPattern.strategy;

class Multiplication implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a * b;
    }
}
