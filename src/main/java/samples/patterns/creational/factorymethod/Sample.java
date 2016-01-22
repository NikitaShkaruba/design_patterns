package samples.patterns.creational.factorymethod;

import java.io.InputStream;

/**
 * Created by Nikita Shkaruba on 22.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Well, there's no code at all.
// It's all because abstract factory is a bunch of factory methods.
public abstract class Sample {
    public boolean getResult() {
        double param1 = getParam1();
        double param2 = getParam2();
        
        return param1/param2 > 0;
    }

    // Factory methods to overwrite and get other logic
    protected abstract Integer getParam1();
    protected abstract double getParam2();
}
