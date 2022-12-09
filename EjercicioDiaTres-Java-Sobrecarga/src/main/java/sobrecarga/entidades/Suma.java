package sobrecarga.entidades;

public class Suma {

    public static int sum(int a, int b){
        System.out.println("Se esta haciendo uso del método con dos parámetros");
        return a + b;



    }
    public static int sum(int... args){
        int sum =0;
        for(int i = 0; i <args.length; i++){
            sum += args[i];
        }
        System.out.println("Se esta haciendo uso del método sobrecarga");
        return sum;
    }


}