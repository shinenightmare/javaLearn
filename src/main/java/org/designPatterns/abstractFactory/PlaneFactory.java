package org.designPatterns.abstractFactory;

public class PlaneFactory implements ProductFactory{
    @Override
    public Experience createExperience() {
        return new PlaneExperience();
    }

    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }
}
