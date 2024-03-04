package org.example;
public class FarToCel {
    public static void main(String[] args) {
        System.out.print("FarToCel!");
    }
    public static float fahrToCel(float f) {
        float c = (float) ((f - 32) * 5 / 9.0);
        return Math.round(c);
    }
    public static float kelvinToCel(float kel) {

        return (float) (kel - 273.15);
    }
    public static float kelvinToFar(float kel) {
        return (float) ((kel - 273.15) * (9/5.0) + 32);
    }

}