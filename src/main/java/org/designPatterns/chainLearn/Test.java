package org.designPatterns.chainLearn;

public class Test {
    public static void main(String[] args) {
        CheckHandle checkHandle=new CalcNum();
        CheckHandle funcNum=new FuncNum();
        checkHandle.setNext(funcNum);
        System.out.println(checkHandle.backResult("add",10,2));
    }
}
