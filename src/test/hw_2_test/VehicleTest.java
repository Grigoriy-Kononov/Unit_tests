package test.hw_2_test;

import main.hw_2.Car;
import main.hw_2.Motorcycle;
import main.hw_2.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarInstanceIsVehicle() {
        Car car = new Car();
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car();
        assertEquals(4, car.numWheels);
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle();
        assertEquals(2, motorcycle.numWheels);
    }

    @Test
    public void testCarSpeedDuringTestDrive() {
        Car car = new Car();
        car.testDrive();
        assertEquals(60, car.speed);
    }

    @Test
    public void testMotorcycleSpeedDuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        assertEquals(75, motorcycle.speed);
    }

    @Test
    public void testCarSpeedAfterPark() {
        Car car = new Car();
        car.testDrive();
        car.park();
        assertEquals(0, car.speed);
    }

    @Test
    public void testMotorcycleSpeedAfterPark() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.speed);
    }
}

