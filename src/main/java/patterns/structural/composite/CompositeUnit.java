package patterns.structural.composite;

import java.util.ArrayList;
/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Composite* composes object to a tree-like structures for hierarchy view: part\whole
// Makes it possible to treat object both complex and separate
public class CompositeUnit implements Unit {
    private ArrayList<Unit> units = new ArrayList();

    public int getStrength() {
        int total = 0;
        for(int i = 0; i< units.size(); ++i)
            total += units.get(i).getStrength();

        return total;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }
}
