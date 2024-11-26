package org.designPatterns.creationalPattern.abstractFactory;

public class CarFactory implements ProductFactory {
    @Override
    public Experience createExperience() {
        return new CarExperience();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
