package patterns.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// A *Flyweight* is an object that minimizes memory usage by sharing as much data as possible with other similar objects
// Flyweight is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory
//
// Good example is a text. It's bad performance to store an object for every symbol.
// So, every symbol is a flyweight, which is used over and over

// Flyweight pool\cache class
public class Menu {
    private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<>();

    CoffeeFlavour lookup(String flavorName) {
        if (!flavours.containsKey(flavorName))
            flavours.put(flavorName, new CoffeeFlavour(flavorName));
        return flavours.get(flavorName);
    }

    int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}
