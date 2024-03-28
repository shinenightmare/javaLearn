package org.designPatterns.state;

interface ElevatorState {
    void openDoors();
    void closeDoors();
    void move();
    void stop();
}
