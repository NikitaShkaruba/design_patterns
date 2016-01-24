package patterns.structural.bridge.bridgeends;

import patterns.structural.bridge.DrawingAPI;

// Concrete implementor 2
public class DrawingAPI2 implements DrawingAPI {
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2(!).circle at %f:%f radius %f\n", x, y, radius);
    }
}
