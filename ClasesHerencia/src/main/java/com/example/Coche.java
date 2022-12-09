package com.example;

public class Coche extends Vehiculo{

    private String color;
    public Coche() {
    }

    public Coche(int pasajeros, int tanqueCombustible, int ruedas, float peso, float consumoPorKm, String color) {
        super(pasajeros, tanqueCombustible, ruedas, peso, consumoPorKm);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", pasajeros=" + pasajeros +
                ", tanqueCombustible=" + tanqueCombustible +
                ", ruedas=" + ruedas +
                ", peso=" + peso +
                ", consumoPorKm=" + consumoPorKm +
                '}';
    }
}
