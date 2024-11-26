package org.designPatterns.behaviorPattern.state;

interface ElevatorState {
    void openDoors();
    void closeDoors();
    void move();
    void stop();
}
