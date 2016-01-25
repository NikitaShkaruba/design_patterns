package patterns.structural.facade;

import java.io.InputStream;
/**
 * Created by Nikita Shkaruba on 25.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Scanner {
    private InputStream inputStream;

    public Scanner(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public void scan() {
        // logic
    }
}
