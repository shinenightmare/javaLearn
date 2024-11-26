package org.designPatterns.structuralPattern.facade;

public class FacadeTest {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade();
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
