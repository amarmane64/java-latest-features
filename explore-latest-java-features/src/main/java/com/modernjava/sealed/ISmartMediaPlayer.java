package com.modernjava.sealed;

public sealed interface ISmartMediaPlayer permits Car {
    public void connectPhone();
}
