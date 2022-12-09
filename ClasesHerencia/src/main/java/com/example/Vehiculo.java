package com.example;

public class Vehiculo {

  //  public class Vehiculo {
  //      int pasajeros, int tanqueCombustible.
  //      int ruedas, float peso, float consumoPorKm
    //atributos de instancia
  //  this pasajeros =pasajeros;
  //  this tanqueCombustible =tanqueCombustible;
 //   this ruedas =ruedas;
 //   this peso =peso;
 //   this consumoPorKm =consumoPorKm;


  //  }


    // atributos de la instancia
    protected int pasajeros;
    protected int tanqueCombustible;
    protected int ruedas;
    protected float peso;
    protected float consumoPorKm;
//geter and setter boton dcho generate
    //metodo/s constructor/es; java x defecto lo tiene reservado implicitamente va de cajón

 //   public Motocicleta(){};
    //utilidad tener mas de una y viene concepto de sobrecarga de mettodos
    //public Camion(){}; public Camion(){}; tener uno vacio y el otro con los atributos

   // public Motocicleta(int pasajeros,int tanqueCombustible, int ruedas, float peso, float consumoPorKm) {
        //this.pasajeros = pasajeros;
      //  this.tanqueCombustible = tanqueCombustible;
      //  this.ruedas = ruedas;
      //  this.peso = peso;
      //  this.consumoPorKm = consumoPorKm;
        //ctrl ins seleccionar


    public Vehiculo() {
    }

    public Vehiculo(int pasajeros, int tanqueCombustible, int ruedas, float peso, float consumoPorKm) {
        this.pasajeros = pasajeros;
        this.tanqueCombustible = tanqueCombustible;
        this.ruedas = ruedas;
        this.peso = peso;
        this.consumoPorKm = consumoPorKm;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getTanqueCombustible() {
        return tanqueCombustible;
    }

    public void setTanqueCombustible(int tanqueCombustible) {
        this.tanqueCombustible = tanqueCombustible;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(float consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
}

    //ctr ins generate getter an setter
   // public int getPasajeros() {
    //    return pasajeros;
   // }

   // public void setPasajeros(int pasajeros) {
   //     this.pasajeros = pasajeros;
   // }

   // public int getTanqueCombustible() {
    //    return tanqueCombustible;
  //  }

   // public void setTanqueCombustible(int tanqueCombustible) {
      //  this.tanqueCombustible = tanqueCombustible;
   // }

 //   public int getRuedas() {
   //     return ruedas;
  //  }

   // public void setRuedas(int ruedas) {
     //   this.ruedas = ruedas;
  //  }

   // public float getPeso() {
    //    return peso;
  //  }

 //   public void setPeso(float peso) {
  ///      this.peso = peso;
   // }

  //  public float getConsumoPorKm() {
 //       return consumoPorKm;
 //   }

    //public void setConsumoPorKm(float consumoPorKm) {
   //     this.consumoPorKm = consumoPorKm;
 //   }
//};

//}