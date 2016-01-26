package patterns.structural.proxy;

/**
 * Created by Nikita Shkaruba on 26.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Simple class
class RealImage implements Image {
    private String filename = null;

    public RealImage(final String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
