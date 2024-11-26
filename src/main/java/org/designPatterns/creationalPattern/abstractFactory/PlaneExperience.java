package org.designPatterns.creationalPattern.abstractFactory;

public class PlaneExperience implements Experience {
    @Override
    public void costTime() {
        System.out.println("plane costTime less");
    }
}
