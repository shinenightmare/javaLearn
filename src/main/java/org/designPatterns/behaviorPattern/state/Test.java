package org.designPatterns.behaviorPattern.state;

public class Test {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        elevator.openDoors(); // 当前状态：开门
        elevator.move();      // 当前状态：开门，无法移动
        elevator.closeDoors(); // 当前状态：关门
        elevator.move();       // 当前状态：移动中
        elevator.stop();       // 当前状态：停止
        elevator.openDoors();  // 当前状态：开门
    }
}
