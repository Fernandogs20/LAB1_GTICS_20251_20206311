package com.example.lab1.Beans;

import java.util.Random;

public class RaceSession {
    public static double calcularRendimiento(int velocidad, int resistencia, int suerte) {
        Random random = new Random();
        return (velocidad * 1.5) + (resistencia * 1.2) + (random.nextInt(10) * suerte);
    }
}
