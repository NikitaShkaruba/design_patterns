package patterns.structural.facade;

import patterns.structural.facade.generators.RISCCodeGenerator;
import patterns.structural.facade.nodes.ProgramNode;
import java.util.stream.Stream;
import java.io.InputStream;
/**
 * Created by Nikita Shkaruba on 25.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Facade* is provider of a simple interface.
// Facade encapsulates complicated system logic in a simple interface.
// Compiler is a Parser, Scanner, ByteCodeBuilder itself, and
public class Compiler {
    public void Compile(Stream input, BytecodeStream output) {
        Scanner scanner = new Scanner((InputStream) input);
        ProgramNodeBuilder builder = new ProgramNodeBuilder();
        Parser parser = new Parser();

        parser.parse(scanner, builder);
        RISCCodeGenerator generator = new RISCCodeGenerator(output);
        ProgramNode parseTree = builder.getRootNode();
        parseTree.traverse(generator);
    }
}
