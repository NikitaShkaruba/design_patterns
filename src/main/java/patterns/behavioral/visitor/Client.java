package patterns.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}
