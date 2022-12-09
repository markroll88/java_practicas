package pricipal;

import entidades.division;
import entidades.multiplicacion;
import entidades.resta;
import entidades.suma;


import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(in);
        out.println("Ingrese el Tipo de Operacion");
        out.println("1_ Suma");
        out.println("2_ Resta");
        out.println("3_ Multiplicacion");
        out.println("4_ Division");

        int respuesta = sc.nextInt();
        out.println("Ud ha elegido la opcion " + respuesta);

        suma Suma = new suma();
        Suma.obtenerTipoDeOperacion();

        suma objetoSuma = new suma();
        int resultadoSuma = objetoSuma.sumarDosNumeros(16, 23);

        out.println(resultadoSuma);


           resta Resta =  new resta();
           Resta.obtenerTipoDeOperacion();
           resta objetoResta = new resta();
           int resultadoaResta = objetoResta.restarDosNumeros(59, 39);
           out.println(resultadoaResta);

        multiplicacion Multiplicacion =  new multiplicacion();
        Multiplicacion.obtenerTipoDeOperacion();
        multiplicacion objetoMultiplicacion = new multiplicacion();
        int resultadoMultiplicacion = objetoMultiplicacion.multiplicarDosNumeros(28, 57);
        out.println(resultadoMultiplicacion);

        division Division =  new division();
        Division.obtenerTipoDeOperacion();
        division objetoDivision = new division();
        int resultadoDivision = objetoDivision.dividirDosNumeros(56, 29);
        out.println(resultadoDivision);






}}
