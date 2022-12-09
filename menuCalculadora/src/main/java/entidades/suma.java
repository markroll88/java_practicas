package entidades;

public class suma {

    private String tipoOperacion = "Esto es una suma entre dos numeros";

    public void obtenerTipoDeOperacion() {
        System.out.println(tipoOperacion);

    }
    public int sumarDosNumeros(int num1, int num2){
        return num1 + num2;
    }
}
