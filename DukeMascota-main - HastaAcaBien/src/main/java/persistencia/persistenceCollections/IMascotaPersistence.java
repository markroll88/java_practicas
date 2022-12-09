package persistencia.persistenceCollections;

import modelos.Mascota;
import persistencia.MascotaPersistence;

import java.util.List;

public class IMascotaPersistence implements MascotaPersistence {



    @Override
    public void guardar(Mascota mascota) {
bdMascotas.add(mascota);
    }

    @Override
    public Mascota getMascota(int id) {
        return null;
    }

    @Override
    public Mascota getMascota(String nombre) {
        return null;
    }

    @Override
    public List<Mascota> getAllMascotas() {
        return bdMascotas;
    }

    @Override
    public void updateMascota(Mascota mascota) {

    }

    @Override
    public void deleteMascota(int id) {

    }
}
