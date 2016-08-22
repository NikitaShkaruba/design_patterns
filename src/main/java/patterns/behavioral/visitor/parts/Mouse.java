package patterns.behavioral.visitor.parts;

import patterns.behavioral.visitor.ComputerPart;
import patterns.behavioral.visitor.ComputerPartVisitor;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}