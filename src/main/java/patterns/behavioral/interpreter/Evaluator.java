package patterns.behavioral.interpreter;

import patterns.behavioral.interpreter.expressions.*;
import java.util.Stack;
import java.util.Map;

public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<>();

        // Parse the expression
        for (String token: expression.split(" ")) {
            switch (token) {
                // Perform plus operation
                case "+": {
                    Expression rightOperand = expressionStack.pop();
                    Expression leftOperand = expressionStack.pop();

                    Expression subExpression = new Plus(leftOperand, rightOperand);
                    expressionStack.push(subExpression);
                    break;
                }
                // Perform minus operation
                case "-": {
                    Expression rightOperand = expressionStack.pop();
                    Expression leftOperand = expressionStack.pop();

                    Expression subExpression = new Minus(leftOperand, rightOperand);
                    expressionStack.push(subExpression);
                    break;
                }
                // Default means it's variable
                default: {
                    expressionStack.push(new Variable(token));
                    break;
                }
            }
        }

        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return syntaxTree.interpret(context);
    }
}