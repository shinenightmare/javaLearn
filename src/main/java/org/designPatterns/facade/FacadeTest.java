package org.designPatterns.facade;

public class FacadeTest {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade();
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
