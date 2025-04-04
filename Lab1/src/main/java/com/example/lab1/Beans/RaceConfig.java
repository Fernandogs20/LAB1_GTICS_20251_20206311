package com.example.lab1.Beans;

public class RaceConfig {
    private String tortuga;
    private int velocidad;
    private int resistencia;
    private int suerte;
    private double apuesta;
    private String tipoPista;

    public RaceConfig() {
    }

    public RaceConfig(String tortuga, int velocidad, int resistencia, int suerte, double apuesta, String tipoPista) {
        this.tortuga = tortuga;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.suerte = suerte;
        this.apuesta = apuesta;
        this.tipoPista = tipoPista;
    }

    public String getTortuga() {
        return tortuga;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getSuerte() {
        return suerte;
    }

    public double getApuesta() {
        return apuesta;
    }

    public String getTipoPista() {
        return tipoPista;
    }

    public void setTortuga(String tortuga) {
        this.tortuga = tortuga;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public void setApuesta(double apuesta) {
        this.apuesta = apuesta;
    }

    public void setTipoPista(String tipoPista) {
        this.tipoPista = tipoPista;
    }
}

