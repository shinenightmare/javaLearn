package org.designPatterns.creationalPattern.factory;

public class PeopleFactory extends AnimalFactory {

    @Override
    Action getAction() {
        return new People();
    }

    @Override
    Shape getShape() {
        return new People();
    }
}
