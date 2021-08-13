import driver.Car;
import service.Location;

public class TextDisplay {

    public void init() {
        System.out.println("Starting new simulation");

    }
    public void draw(Car car) {

        System.out.println("Car"+car.getId() + " at " + car.getLocation());

    }

    public void drawLine(Location a, Location b) {
        System.out.println("Line from " + a + " to " + b);
    }
}
