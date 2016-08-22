package patterns.behavioral.visitor.parts;

import patterns.behavioral.visitor.ComputerPartVisitor;
import patterns.behavioral.visitor.ComputerPart;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
