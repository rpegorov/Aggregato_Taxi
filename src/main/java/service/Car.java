package service;

public abstract class Car {

    private int id;

    protected int maxSpeed;
    public static final int Idle = 1;
    public static final int Booked = 2;
    public static final int OnTrip = 3;

    // should only be called by the derived classes, passing in the id of the car
    // and the color of the car
    protected Car(int fid, int speed) {
        this.id = fid;
        this.maxSpeed = speed;
    }

    public int getId() {
        return id;
    }

    public int getSpeed() {
        return maxSpeed;
    }

    public int distSqrd(Location loc) {
        return 0;
    }


    public abstract void setLocation(Location l);

    public abstract Location getLocation();

    public abstract void setStatus(int s);

    public abstract int getStatus();

    public abstract Trip getTrip();

    public abstract void assignTrip(Trip trip);

    // return location of start of trip (where customer is to be picked up)
    // null if idle
    public abstract Location getStart();

    // return location of end of trip (where customer is to be dropped off)
    // null if idle

    public abstract Location getDest();

    public abstract void updateLocation(double deltaT);
}
