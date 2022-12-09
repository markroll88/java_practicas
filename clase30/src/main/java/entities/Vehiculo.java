package entities;

import java.util.ArrayList;

public class Vehiculo {


    public int peso;

    public void pesar() {
    this.peso = (int) (Math.random() * 20 +1);

}



    public int getPeso() {
        return peso;
    }
}
