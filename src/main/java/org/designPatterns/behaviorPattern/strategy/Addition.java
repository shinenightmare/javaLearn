package org.designPatterns.behaviorPattern.strategy;

class Addition implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
