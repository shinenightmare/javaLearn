package org.designPatterns.structuralPattern.flyweight;

public enum Color {
    RED("红色",1),
    GREEN("绿色",2),
    BLUE("蓝色",3),
    YELLOW("黄色",4);
    private String name;
    private int index;

    Color(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
