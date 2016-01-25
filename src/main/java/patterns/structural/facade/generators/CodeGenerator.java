package patterns.structural.facade.generators;

import patterns.structural.facade.BytecodeStream;
import patterns.structural.facade.nodes.ExpressionNode;
import patterns.structural.facade.nodes.StatementNode;
/**
 * Created by Nikita Shkaruba on 25.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class CodeGenerator {
    protected BytecodeStream output;

    protected CodeGenerator(BytecodeStream stream) {
        // logic
    }

    public void visit(StatementNode statementNode) {
        // logic
    }
    public  void visit(ExpressionNode expressionNode) {
        // logic
    }
}
