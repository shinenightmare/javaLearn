package org.designPatterns.singleton;

public class Singleton {
    private static Singleton singleton;

    //将默认的构造方法私有化
    private Singleton() {
    }
    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
    public void innerMethod(){
        System.out.println("this is singletonMethod!");
    }
}
