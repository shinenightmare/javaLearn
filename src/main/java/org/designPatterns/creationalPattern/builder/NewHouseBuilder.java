package org.designPatterns.creationalPattern.builder;

public class NewHouseBuilder extends HouseBuilder {
    @Override
    public void buildFoundation() {
        this.house.setFoundation("goodFoundation");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("goodRoof");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("goodStructure");
    }

    @Override
    public void buildInterior() {
        this.house.setStructure("goodInterior");
    }
}
