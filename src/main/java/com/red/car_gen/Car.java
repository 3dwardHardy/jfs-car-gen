package com.red.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    public int accelerateSpeed() {
        if(getSpeed() < getMaxSpeed()) {

            setSpeed(getSpeed() + 5);
        } else {
            System.out.println("Car cannot exceed its maximum speed");
        }
        return getSpeed();
    }

    public int decelerateSpeed() {
        if(getSpeed() > 1) {
            setSpeed(getSpeed() - 5);
        } else {
            System.out.println("Car cannot decelerate below 0 MPH");
        }
        return getSpeed();
    }

    public boolean convertToElectric() {
        if(isElectric == false) {
            isElectric = true;
        } else {
            System.out.println("Car is already electric");
        }
        return isElectric;
    }
}
