package org.designPatterns.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("sample.jpg");

        // 图像未加载，直到调用display()方法
        image.display();
        System.out.println("---------------------------------");
        // 图像已加载，无需再次创建
        image.display();
    }
}
