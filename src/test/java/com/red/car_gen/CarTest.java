package com.red.car_gen;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
 @Test
    public void testAccelerateSpeed() {
        Honda civic = new Honda("red", 1990, 100, false);
        assertEquals(5,civic.accelerateSpeed());
    }
    @Test
    public void testDecelerateSpeed() {
        Honda civic = new Honda("red", 1990, 100, false);
        civic.accelerateSpeed();
        assertEquals(0, civic.decelerateSpeed());
    }

    @Test
    public void testConvertToElectric() {
        Honda civic = new Honda("red", 1990, 100, false);
        civic.setElectric(false);
        assertEquals(true, civic.convertToElectric());
    }

   
}
