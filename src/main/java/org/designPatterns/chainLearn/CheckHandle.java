package org.designPatterns.chainLearn;

public abstract class CheckHandle{
    private CheckHandle next;

    public CheckHandle getNext() {
        return next;
    }

    public void setNext(CheckHandle next) {
        this.next = next;
    }
    public abstract Integer backResult(String id, int a, int b);
}
