package org.designPatterns.creationalPattern.factory;

public class FactoryTest {
    public static void main(String[] args) {
        AnimalFactory birdFactory=new BirdFactory();
        Action birdAction=  birdFactory.getAction();
        AnimalFactory fishFactory=new FishFactory();
        Action fishAction=  fishFactory.getAction();
        AnimalFactory peopleFactory=new PeopleFactory();
        Action peopleAction= peopleFactory.getAction();
        System.out.println("--------------move-------------------");
        birdAction.move();
        fishAction.move();
        peopleAction.move();
        System.out.println("--------------food-------------------");
        birdAction.food();
        fishAction.food();
        peopleAction.food();
        Shape birdShape=birdFactory.getShape();
        Shape fishShape=fishFactory.getShape();
        Shape peopleShape=peopleFactory.getShape();
        birdShape.limb();
        fishShape.limb();
        peopleShape.limb();
    }
}
