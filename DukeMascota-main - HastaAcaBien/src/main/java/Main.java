import modelos.DukeMascota;
import modelos.Mascota;
import persistencia.persistenceCollections.IMascotaPersistence;

public class Main {


    public static void main(String[] args) {

        IMascotaPersistence persistence = new IMascotaPersistence();


        DukeMascota duke = new DukeMascota("Duke-Merlina", "Marbrakro");
        DukeMascota duke1 = new DukeMascota("Duke-Thor", "Marbrakro");
        DukeMascota duke2 = new DukeMascota("Duke-Oso", "Marbrakro");
        DukeMascota duke3 = new DukeMascota("Duke-Kiara", "Marbrakro");
        DukeMascota duke4 = new DukeMascota("Duke-Bebes", "Marbrakro");
        DukeMascota duke5 = new DukeMascota("Duke-Onna", "Marbrakro");
        DukeMascota duke6 = new DukeMascota("Duke-Moon", "Marbrakro");
        DukeMascota duke7 = new DukeMascota("Duke-Tully", "Marbrakro");
        DukeMascota duke8 = new DukeMascota("Duke-Blue", "Marbrakro");
        DukeMascota duke9 = new DukeMascota("Duke-Patrick", "Marbrakro");
        DukeMascota duke10 = new DukeMascota("Duke-KaiMili", "Marbrakro");
        persistence.guardar(duke);
        //Jlabel1.setIcon(new ImageIcon(ruta);
        persistence.guardar(duke1);
        persistence.guardar(duke2);
        persistence.guardar(duke3);
        persistence.guardar(duke4);
        persistence.guardar(duke5);
        persistence.guardar(duke6);
        persistence.guardar(duke7);
        persistence.guardar(duke8);
        persistence.guardar(duke9);
        persistence.guardar(duke10);

        for (Mascota mascota : persistence.getAllMascotas()) {
            System.out.println(mascota);
        }

        // for (Mascota mascota : persistence.getAllMascotas(){
        //     System.out.println(mascota.getNombre());
    }
}



