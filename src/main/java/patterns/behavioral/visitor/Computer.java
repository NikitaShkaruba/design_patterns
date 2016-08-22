package patterns.behavioral.visitor;

import patterns.behavioral.visitor.parts.*;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts)
            part.accept(computerPartVisitor);

        computerPartVisitor.visit(this);
    }
}
