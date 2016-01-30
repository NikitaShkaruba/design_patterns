package patterns.behavioral.iterator;

/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Client {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for(Iterator i = repository.getIterator(); i.hasNext();){
            String name = (String)i.next();
            System.out.println("Name : " + name);
        }
    }
}