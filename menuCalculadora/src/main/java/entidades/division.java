package entidades;

public class division {
    private String tipoOperacion = "Esto es una division entre dos numeros";

    public void obtenerTipoDeOperacion() {
        System.out.println(tipoOperacion);

    }
    public int dividirDosNumeros(int num1, int num2){
        return num1 - num2;


}}