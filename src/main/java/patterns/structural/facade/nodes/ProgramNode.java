package patterns.structural.facade.nodes;

import patterns.structural.facade.generators.CodeGenerator;
import java.util.ArrayList;
/**
 * Created by Nikita Shkaruba on 25.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class ProgramNode {
    protected ArrayList<ProgramNode> childrens = new ArrayList<>();

    protected ProgramNode() {

    }

    // node manipulation
    public void getSourcePosition(int line, int index) {
        // logic
    }

    // children manipulation
    public void add(ProgramNode node) {
        // logic
    }
    public void remove(ProgramNode node) {
        // logic
    }

    public void traverse(CodeGenerator codeGenerator) {
        // logic
    }
}
