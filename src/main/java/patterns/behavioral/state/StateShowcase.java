package patterns.behavioral.state;

import java.io.IOException;
import java.util.Scanner;

/**
 * Pattern *State* allows an object to alter its behavior when its internal state changes.
 */
public class StateShowcase {
    public static void main(String[] args) throws IOException {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Press any button to pull fan chain: ");
            scanner.next();
            chain.pull();
        }
    }
}
