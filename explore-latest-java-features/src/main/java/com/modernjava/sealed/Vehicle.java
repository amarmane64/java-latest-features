package com.modernjava.sealed;

public  sealed abstract class Vehicle permits Car, Truck, TemporaryVehicle {

    public abstract String drive();
}

