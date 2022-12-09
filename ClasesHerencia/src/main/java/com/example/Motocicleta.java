package com.example;

  // atributos de la clase static no hay que intanciarlos
public class Motocicleta extends Vehiculo{


      public Motocicleta() {
      }

      public Motocicleta(int pasajeros, int tanqueCombustible, int ruedas, float peso, float consumoPorKm) {
          super(pasajeros, tanqueCombustible, ruedas, peso, consumoPorKm);

      }
// atributos de la instancia
   // private int pasajeros;
  //  private int tanqueCombustible;
 //   private int ruedas;
  //  private float peso;
 //   private float consumoPorKm;
//geter and setter boton dcho generate
    //metodo/s constructor/es; java x defecto lo tiene reservado implicitamente va de cajón

  //   public Motocicleta(){};
      //utilidad tener mas de una y viene concepto de sobrecarga de mettodos
      //public Camion(){}; public Camion(){}; tener uno vacio y el otro con los atributos

  //    public Motocicleta(int pasajeros,int tanqueCombustible, int ruedas, float peso, float consumoPorKm) {
    //      this.pasajeros = pasajeros;
    //      this.tanqueCombustible = tanqueCombustible;
    //      this.ruedas = ruedas;
      //    this.peso = peso;
       //   this.consumoPorKm = consumoPorKm;
          //ctrl ins seleccionar


      @Override
      public String toString() {
          return "Motocicleta{" +
                  "pasajeros=" + pasajeros +
                  ", tanqueCombustible=" + tanqueCombustible +
                  ", ruedas=" + ruedas +
                  ", peso=" + peso +
                  ", consumoPorKm=" + consumoPorKm +
                  '}';
      }
  }

//ctr ins generate getter an setter
     // public int getPasajeros() {
      //    return pasajeros;
     // }
//
     // public void setPasajeros(int pasajeros) {
     //     this.pasajeros = pasajeros;
    //  }

     // public int getTanqueCombustible() {
       //   return tanqueCombustible;
    //  }

    //  public void setTanqueCombustible(int tanqueCombustible) {
       //   this.tanqueCombustible = tanqueCombustible;
    //  }

    //  public int getRuedas() {
    //      return ruedas;
  //    }

   //   public void setRuedas(int ruedas) {
   //       this.ruedas = ruedas;
   //   }

  //    public float getPeso() {
    //      return peso;
      //}

     // public void setPeso(float peso) {
   //       this.peso = peso;
   //   }

   //   public float getConsumoPorKm() {
     //     return consumoPorKm;
      //}

     // public void setConsumoPorKm(float consumoPorKm) {
      //    this.consumoPorKm = consumoPorKm;
    //  }
//  };

//getter and setter min 38 /41 aprox


// metodos vacio metodos de instaciar los getter and setter


