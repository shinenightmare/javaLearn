package org.designPatterns.interpreter;

public class SubExpression implements Expression{
    private Expression leftOperand;
    private Expression rightOperand;

    public SubExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() - rightOperand.interpret();
    }
}
