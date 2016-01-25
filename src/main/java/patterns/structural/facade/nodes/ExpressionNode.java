package patterns.structural.facade.nodes;

import patterns.structural.facade.generators.CodeGenerator;
/**
 * Created by Nikita Shkaruba on 25.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class ExpressionNode extends ProgramNode {
    public void traverse(CodeGenerator codeGenerator) {
        codeGenerator.visit(this);

        for (ProgramNode children : this.childrens) {
            children.traverse(codeGenerator);
        }
    }
}
