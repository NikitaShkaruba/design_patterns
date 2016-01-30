package patterns.behavioral.iterator;

/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Simple collection with hidden realization
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Container's own iterator
    private class NameIterator implements Iterator {
        int index;

        public NameIterator() {

        }

        @Override
        public boolean hasNext() {
            return (index < names.length);
        }
        @Override
        public Object next() {
            return (this.hasNext())? names[index++] : null;

        }
    }
}
