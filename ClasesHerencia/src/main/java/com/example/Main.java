package com.example;

public class Main {

    public static void main(String[] args){

   // Motocicleta motocicleta1 = new Motocicleta();
    //si se define un metodo contructor el vacio se anula, si se necesita se debe vover a escribir
  //      Motocicleta motocicleta2 = new Motocicleta(
    //            3,300,6,10000f,3f);
        //agregar f o punto y doble cero. si es double lo mismo
     //   System.out.println(motocicleta);
        // el camion motocicleta junto a Vehiculoes la creacion de una variable
 Camion camion = new Camion();
 Vehiculo motocicleta = new Motocicleta();
 Vehiculo coche = new Coche();

//poliformismo cada uno de los lenguajes tiene concepto distinto,
        // intancio classe al hacereef a la clase o al tipo de datos padre
        camion.setPeso(10000f);
        camion.setPasajeros(3);
        camion.setRuedas(6);
        camion.setTanqueCombustible(300);
        camion.setConsumoPorKm(3f);
        camion.setPesoCarga(15000f);


        System.out.println(camion);
        //todos los object en java todos heredan tostring

        motocicleta.setPasajeros(2);
        motocicleta.setRuedas(2);
        motocicleta.setPeso(1000f);
        motocicleta.setTanqueCombustible(55);
        motocicleta.setConsumoPorKm(1f);

        System.out.println(motocicleta);

        coche.setPasajeros(4);
        coche.setRuedas(4);
        coche.setPeso(1500f);
        coche.setConsumoPorKm(2f);
        coche.setTanqueCombustible(42);
        ((Coche) coche).setColor("verde");

        System.out.println(coche);

        //aunque pongamos toString en padre e hijo se imprime lo del hijo las friams son iguales
        //se hace uso del toString del hijo x poliformismo
 }


}
