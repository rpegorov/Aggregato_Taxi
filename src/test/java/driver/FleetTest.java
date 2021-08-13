package driver;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FleetTest {

    @Test
    public void addCar() {
        ArrayList<Car> cars = new ArrayList<>();
        Car c = new Car(1, 60);
        cars.add(c);
        Assert.assertTrue(cars.add(c));
    }
}