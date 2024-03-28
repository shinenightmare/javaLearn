package org.designPatterns.composite;

public class File implements FileSystemComponent{
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("File: " + name);
    }
}
