package com.red.car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("Red", 1990, 85, false);
        Lexus rx350 = new Lexus("White", 2010, 120, true);
        Toyota supra = new Toyota("Blue", 2005, 150, false);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        civic.accelerateSpeed();
        civic.accelerateSpeed();
        System.out.println(civic.getSpeed());

        civic.decelerateSpeed();
        civic.decelerateSpeed();
        System.out.println(civic.getSpeed());

        civic.setElectric(true);
        civic.convertToElectric();

        System.out.println(rx350.convertToElectric());
    }
}
