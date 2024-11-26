package org.designPatterns.creationalPattern.factory;

public class FishFactory extends AnimalFactory {

    @Override
    Action getAction() {
        return new Fish();
    }

    @Override
    Shape getShape() {
        return new Fish();
    }
}
