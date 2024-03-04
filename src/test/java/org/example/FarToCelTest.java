package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarToCelTest {
    @Test
    public void testFahrToCel() {
        assertEquals(0, FarToCel.fahrToCel(32), 0.01);
        assertEquals(100, FarToCel.fahrToCel(212), 0.01);
        assertEquals(37, FarToCel.fahrToCel(98.6f), 0.01);
    }
    @Test
    public void testKelvinToCel() {
        assertEquals(0, FarToCel.kelvinToCel(273.15f), 0.01);
        assertEquals(100, FarToCel.kelvinToCel(373.15f), 0.01);
        assertEquals(37, FarToCel.kelvinToCel(310.15f), 0.01);
    }
    @Test
    public void testKelvinToFar() {
        assertEquals(32f, FarToCel.kelvinToFar(273.15f), 0.01);
        assertEquals(212f, FarToCel.kelvinToFar(373.15f), 0.01);
        assertEquals(98.6f, FarToCel.kelvinToFar(310.15f), 0.01);
    }
}