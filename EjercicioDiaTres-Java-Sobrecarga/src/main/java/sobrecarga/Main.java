package sobrecarga;

import sobrecarga.entidades.Suma;

public class Main {

    public static void main(String[] args){

        int resultadoSuma = Suma.sum(6, 4);
        System.out.println(resultadoSuma);

        resultadoSuma = Suma.sum( 18, 25, 64, 89, 20, 24, 8, 77);
        System.out.println(resultadoSuma);


    }
}
