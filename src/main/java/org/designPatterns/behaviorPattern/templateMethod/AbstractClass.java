package org.designPatterns.behaviorPattern.templateMethod;

public abstract class AbstractClass {
    public void templateMethod() {
        step1();
        step2();
        step3();
    }

    // 基本方法，子类需要实现
    abstract void step1();
    abstract void step2();
    abstract void step3();
}
