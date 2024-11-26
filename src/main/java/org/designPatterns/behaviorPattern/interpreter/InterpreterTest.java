package org.designPatterns.behaviorPattern.interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        Expression expression = new AddExpression(new NumberExpression(2),
                new SubExpression(
                        new NumberExpression(3),
                        new NumberExpression(1)
                )
        );

        // 解释并计算表达式的值
        int result = expression.interpret();
        System.out.println("Result: " + result);
    }
}
