package org.designPatterns.pck2;

public class ConnectionManager {
    static int time = 3;
    static Connection[] con = new Connection[3];//这里还没开始赋值,不会报错。

    {
        for (int i = 0; i < 3; i++) {
            con[i] = Connection.getConnection();
        }
    }

    static Connection getConnection() {
        if (time > 0) {
            return con[--time];
        }
        else
            System.out.println("Null");
        return null;
    }

    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        for (int j = 0; j <= 3; j++) {
            cm.getConnection();
        }
    }
}
