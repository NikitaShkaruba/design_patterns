package patterns.structural.bridge;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Bridge* encloses some logic in interface and keeps a pointer to it's realisation.
// Bridge publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy!
public abstract class Shape {
    // bridge itself
    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();                                    // low-level
    public abstract void resizeByPercentage(double percentage);     // high-level
}

// This class has no bridge
abstract class ShapeWithoutBridge implements DrawingAPI {
    protected ShapeWithoutBridge() {

    }

    public abstract void draw();                            // low-level
    public abstract void resizeByPercentage(double pct);    // high-level

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
    }
}
