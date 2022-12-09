import entities.Camion;
import entities.Coche;
import entities.Motocicleta;
import entities.Vehiculo;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //Camion camionUno = new Camion();
        // camionUno.pesar();
        // camionUno.getPeso();
        //  System.out.println(camionUno.getPeso());

        // Motocicleta motoUno = new Motocicleta();
        //  motoUno.pesar();
        // System.out.println(motoUno.getPeso());

        //  Coche cocheUno = new Coche();
        //  cocheUno.pesar();
        //  cocheUno.getPeso();
        //  System.out.println(cocheUno.getPeso());
//guardar datos ingresados en un array para el crud
        //   Coche cocheDos = new Coche();
        //   Motocicleta motoDos = new Motocicleta();
        //   Camion camionDos = new Camion();
        // ArrayList<Camion>ListadeCamiones = new ArrayList<>();

        //  ListadeCamiones.add(camionUno);
        //   ListadeCamiones.add(camionDos);

      //  ArrayList<Integer> listadeVehiculosPeso = new ArrayList<>();
Array ListadevehiculosPeso[] =  new Array[10];

        Vehiculo camionUno = new Camion();
        camionUno.pesar();
        camionUno.getPeso();
        listadeVehiculosPeso[].add(camionUno.peso);

        Vehiculo camionDos = new Camion();
        camionDos.pesar();
        camionDos.getPeso();
        listadeVehiculosPeso.add(camionDos.getPeso());

 //
 //
  //
 //
 //
 //
 //
        Vehiculo cocheUno = new Coche();
        cocheUno.pesar();
        cocheUno.getPeso();
        listadeVehiculosPeso.add(cocheUno.getPeso());

        Vehiculo cocheDos = new Coche();
        cocheDos.pesar();
        cocheDos.getPeso();
        listadeVehiculosPeso.add(cocheDos.getPeso());

        Vehiculo motoUno = new Motocicleta();
        motoUno.pesar();
        motoUno.getPeso();
        listadeVehiculosPeso.add(motoUno.getPeso());

        Vehiculo motoDos = new Motocicleta();
        motoDos.pesar();
        motoDos.getPeso();
        listadeVehiculosPeso.add(motoDos.getPeso());




        for (int x = 0; x <7; x++) {
            // for(int elemento1 : ListadeVehiculosPeso) {
            System.out.println(ListadevehiculosPeso[x]);


        }

        System.out.println(camionUno.getPeso());
        System.out.println(camionDos.getPeso());
        System.out.println(cocheUno.getPeso());
        System.out.println(cocheDos.getPeso());
        System.out.println(motoUno.getPeso());
        System.out.println(motoDos.getPeso());







        //ListadeVehiculosPeso.add(camionDos.getPeso());
       // ListadeVehiculosPeso.add(cocheUno.getPeso());
      //  ListadeVehiculosPeso.add(cocheDos.getPeso());
      //  ListadeVehiculosPeso.add(motoUno.getPeso());
     //   ListadeVehiculosPeso.add(motoDos.getPeso())




        ArrayList<Vehiculo> ListadeVehiculos = new ArrayList<>(6);

        ListadeVehiculos.add(camionUno);
        ListadeVehiculos.add(camionDos);
        ListadeVehiculos.add(cocheUno);
        ListadeVehiculos.add(cocheDos);
        ListadeVehiculos.add(motoUno);
        ListadeVehiculos.add(motoDos);

        for(Vehiculo elemento : ListadeVehiculos){
            System.out.println(elemento);
        }




    }}
