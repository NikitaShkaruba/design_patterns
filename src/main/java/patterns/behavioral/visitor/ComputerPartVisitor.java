package patterns.behavioral.visitor;

import patterns.behavioral.visitor.parts.*;

// Pattern *Visitor* allows one to add new virtual functions to a family of classes without modifying the classes themselves
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
