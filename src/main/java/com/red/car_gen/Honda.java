package com.red.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;

    public Honda(String color, int year, int maxSpeed, boolean isTurboCharged) {
        super(color, year, maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }

    public boolean isTurboCharged() {
        return isTurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        isTurboCharged = turboCharged;
    }
}
