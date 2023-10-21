package main.hw_2;

public abstract class Vehicle {
    protected String company;
    protected String model;
    protected int yearRelease;
    public int numWheels;
    public int speed;

    public abstract void testDrive();
    public abstract void park();
}
