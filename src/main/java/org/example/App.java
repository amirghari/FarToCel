package org.example;


public class App {
    public static void main(String[] args) {
        System.out.println("212 Fahrenheit is equal to " + String.format("%.1f", FarToCel.fahrToCel(212)) + " Celsius.");
        System.out.println("273 Kelvin is equal to " + String.format("%.1f", FarToCel.kelvinToCel(273f)) + " Celsius."); // Ensure kelvintoCel method handles the conversion accurately.
        System.out.println("300.1 Kelvin is equal to " + String.format("%.1f", FarToCel.kelvinToFar(300.1f)) + " Fahrenheit.");
    }
}