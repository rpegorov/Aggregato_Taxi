package resources;

import driver.Car;
import driver.Fleet;
import service.Trip;

import java.util.ArrayList;

public class Platform {
    private ArrayList<Fleet> fleets;

    public Platform() {
        fleets = new ArrayList<Fleet>();
    }

    public void addFleet(Fleet f) {
        fleets.add(f);
    }

    // for a request defined as a Trip, find the best car by checking each of its fleets
    // and assigns the car to this trip
    public Car assignCar(Trip trip) {

        Car min = null;
        double dist = Double.POSITIVE_INFINITY;
        for (Fleet f: fleets) {
            Car c = (Car) f.findNearestCar(trip.getStart());
            if(c != null) {
                if(Math.sqrt(c.distSqrd(trip.getStart())) < dist) {
                    min = c;
                    dist = Math.sqrt(c.distSqrd(trip.getStart()));
                }
            }
        }
        if (min != null) {
            min.assignTrip(trip);
        } else {
            System.out.println("No Cars available");
        }
        return min;   // replace with implementation
    }

    // returns list of all cars (in all the fleets) managed by this platform
    public ArrayList<Car> findCars() {
        ArrayList<Car> allCars = new ArrayList<Car>();
        for (Fleet f: fleets) {
            for(service.Car c: f.getCars()) {
                allCars.add((Car) c);
            }
        }
        return allCars;
    }
}
