package com.modernjava.sealed;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Test
    void vehicleTest(){
        var car = new Car();
        var truck = new Truck();
        assertInstanceOf(Vehicle.class, car);
        assertInstanceOf(Vehicle.class, truck);
    }
}
