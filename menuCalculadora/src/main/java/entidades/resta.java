package entidades;

public class resta {
    private String tipoOperacion = "Esto es una resta entre dos numeros";

    public void obtenerTipoDeOperacion() {
        System.out.println(tipoOperacion);

    }
    public int restarDosNumeros(int num1, int num2){
        return num1 - num2;
    }



}
