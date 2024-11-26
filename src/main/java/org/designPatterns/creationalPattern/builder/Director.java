package org.designPatterns.creationalPattern.builder;

public class Director {
    private HouseBuilder houseBuilder;
    public Director(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }
    public House buildHouse(){
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
        return houseBuilder.getHouse();
    }
}
