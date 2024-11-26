package org.designPatterns.behaviorPattern.memento;

public class Test {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置初始状态
        originator.setState("State 1");
        System.out.println("Current State: " + originator.getState());

        // 创建备忘录并保存状态
        caretaker.setMemento(originator.createMemento());

        // 修改状态
        originator.setState("State 2");
        System.out.println("Updated State: " + originator.getState());

        // 恢复之前的状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("Restored State: " + originator.getState());
    }
}
