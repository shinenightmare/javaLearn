package org.designPatterns.behaviorPattern.mediator;

public class Test {
    public static void main(String[] args) {
        ConcreteChatMediator chatMediator = new ConcreteChatMediator();

        User user1 = new User("Alice", chatMediator);
        User user2 = new User("Bob", chatMediator);
        User user3 = new User("Charlie", chatMediator);

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("大家好！");
        user2.sendMessage("你好，Alice！");
    }
}
