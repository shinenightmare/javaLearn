package org.designPatterns.pck2;

public class Connection {
    private Connection(){
        System.out.println("new Connection");
    }
    public static Connection getConnection(){
        return new Connection();
    }
}
