package patterns.structural.facade;

import patterns.structural.facade.nodes.ProgramNode;
/**
 * Created by Nikita Shkaruba on 25.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class ProgramNodeBuilder {
    private ProgramNode node;

    public ProgramNode NewVariable(String variableName) {
        return (ProgramNode) new Object();
    }
    public ProgramNode newAssignment(ProgramNode variable, ProgramNode expression) {
        return (ProgramNode) new Object();
    }
    public ProgramNode newReturnStatement(ProgramNode value) {
        return (ProgramNode) new Object();
    }
    public ProgramNode newCondition(ProgramNode condition, ProgramNode truePart, ProgramNode falsePart) {
        return (ProgramNode) new Object();
    }

    public ProgramNode getRootNode() {
        return node;
    }
}
