package org.designPatterns.creationalPattern.abstractFactory;

public class CarExperience implements Experience {
    @Override
    public void costTime() {
        System.out.println("car costTime more");
    }
}
