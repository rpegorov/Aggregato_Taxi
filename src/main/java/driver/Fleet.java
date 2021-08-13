package driver;

import service.Car;
import service.Location;
import java.util.ArrayList;

public class Fleet extends service.Fleet {

    private ArrayList<Car> cars;
    private int carId;

    public Fleet(String colour) {
        super(111,colour);
        cars = new ArrayList<Car>();
        carId = 1;
    }

    @Override
    public void addCar(int speed) {
        int temp  = this.getId();
        int x = carId;
        while(x > 0)
        {
            temp = temp * 10;
            x /= 10;
        }
        temp += carId;
        cars.add(new driver.Car(temp,speed));
        carId++;
    }

    @Override
    public Car findNearestCar(Location loc) {
        Car min = null;
        double temp = Double.POSITIVE_INFINITY;
        for(Car c: cars)
        {
            if(c.getStatus() == 1)
            {
                if(Math.sqrt(c.distSqrd(loc)) < temp)
                {
                    temp = Math.sqrt(c.distSqrd(loc));
                    min = c;
                }
            }
        }
        return min;
    }

    @Override
    public ArrayList<? extends Car> getCars() {
        return cars;
    }
}
