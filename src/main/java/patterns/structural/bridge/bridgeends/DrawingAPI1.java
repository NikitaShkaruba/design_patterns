package patterns.structural.bridge.bridgeends;

import patterns.structural.bridge.DrawingAPI;

// Concrete implementor 1
public class DrawingAPI1 implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
    }
}
