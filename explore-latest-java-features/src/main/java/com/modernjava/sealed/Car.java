package com.modernjava.sealed;

public sealed class Car extends Vehicle implements ISmartMediaPlayer permits  FlyingCar{

    @Override
    public String drive() {
        return "CAR";
    }

    @Override
    public void connectPhone() {
        System.out.println("Phone Connected");
    }
}
