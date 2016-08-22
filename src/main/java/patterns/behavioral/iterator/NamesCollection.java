package patterns.behavioral.iterator;

public class NamesCollection {
    public String[] names = { "Robert" , "John" ,"Julie" , "Lora" };

    public Iterator getIterator() {
        return new NameIterator();
    }

    // Container's own iterator
    private class NameIterator implements Iterator {
        private int index;

        public NameIterator() {}

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
