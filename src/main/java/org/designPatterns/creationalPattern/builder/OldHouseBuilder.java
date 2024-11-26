package org.designPatterns.creationalPattern.builder;

public class OldHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() {
        this.house.setFoundation("badFoundation");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("badRoof");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("badStructure");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("badStructure");
    }
}
