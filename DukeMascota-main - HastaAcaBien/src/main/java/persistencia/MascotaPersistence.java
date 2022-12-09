package persistencia;

import modelos.Mascota;

import java.util.ArrayList;
import java.util.List;

public interface MascotaPersistence {

    List<Mascota>bdMascotas = new ArrayList<>();
    void guardar(Mascota mascota);
    Mascota getMascota(int id);
    Mascota getMascota(String nombre);
    List<Mascota> getAllMascotas();
    void updateMascota(Mascota mascota);
    void deleteMascota(int id);
}
