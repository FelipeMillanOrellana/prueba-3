package cl.duoc.HoytsMarkPlanet.Service.Imp;


import cl.duoc.hoytsmarkplanet.DTO.PeliculaDTO;
import cl.duoc.hoytsmarkplanet.Service.IPelicula;
import java.util.ArrayList;
import java.util.List;

public class PeliculaService implements IPelicula {

    List<PeliculaDTO> lista = new ArrayList<>();
    
    @Override
    public void Guardar(PeliculaDTO p) {
        this.lista.add(p);
    }

    @Override
    public List<PeliculaDTO> Listar() {
        return this.lista;
    }
    
}