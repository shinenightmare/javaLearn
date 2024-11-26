package org.designPatterns.creationalPattern.builder;

public class HouseTest {
    public static void main(String[] args) {
        HouseBuilder oldHouseBuilder=new OldHouseBuilder();
        Director director1=new Director(oldHouseBuilder);
        House oldHouse=director1.buildHouse();
        System.out.println("old house:"+oldHouse);
    }
}
