package com.example;

// la clase entiende de una clase padre que se llama vehiculo
public class Camion extends Vehiculo {

    private float pesoCarga;


    public Camion(){

    }

    public Camion(int pasajeros, int tanqueCombustible, int ruedas, float peso, float consumoPorKm, float pesoCarga) {
        super(pasajeros, tanqueCombustible, ruedas, peso, consumoPorKm);
        this.pesoCarga = pesoCarga;

    }

    public float getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(float pesoCarga) {
        this.pesoCarga = pesoCarga;
    }
    //alt ins toString en Generate

    @Override
    public String toString() {
        return "Camion{" +
                "pesoCarga=" + pesoCarga +
                ", pasajeros=" + pasajeros +
                ", tanqueCombustible=" + tanqueCombustible +
                ", ruedas=" + ruedas +
                ", peso=" + peso +
                ", consumoPorKm=" + consumoPorKm +
                '}';
    }
}
