package org.designPatterns.creationalPattern.factory;

public class BirdFactory extends AnimalFactory {

    @Override
    Action getAction() {
        return new Bird();
    }

    @Override
    Shape getShape() {
        return new Bird();
    }
}
