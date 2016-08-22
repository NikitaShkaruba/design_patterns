package patterns.behavioral.iterator;

/**
 * Pattern *Iterator* encapsulates inner traversal logic, providing easy interface for clients
 */
public class IteratorShowcase {
    public static void main(String[] args) {
        NamesCollection collection = new NamesCollection();

        for(Iterator i = collection.getIterator(); i.hasNext();){
            String name = (String)i.next();
            System.out.println("Name : " + name);
        }
    }
}