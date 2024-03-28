package org.designPatterns.chainOfResponsibility;

public abstract class ReimbursementHandler {
    protected ReimbursementHandler successor;

    public void setSuccessor(ReimbursementHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(ReimbursementRequest request);
}
