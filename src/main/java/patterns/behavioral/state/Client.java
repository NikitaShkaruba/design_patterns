package patterns.behavioral.state;

import java.io.IOException;
import java.util.Scanner;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Client {
    public static void main(String[] args) throws IOException {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Press any button to pull fan chain: ");

            scanner.next();
            chain.pull();
        }
    }
}
