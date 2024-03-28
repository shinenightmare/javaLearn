package org.designPatterns.command;

public class Test {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(livingRoomLightOn);
        remote.pressButton(); // 打开电灯

        remote.setCommand(livingRoomLightOff);
        remote.pressButton(); // 关闭电灯
    }
}
