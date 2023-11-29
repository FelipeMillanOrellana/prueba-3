package cl.duoc.hoytsmarkplanet.Service;

import cl.duoc.hoytsmarkplanet.DTO.PeliculaDTO;

import java.util.List;

public interface IPelicula {
    public void Guardar(PeliculaDTO p);
    
    public List<PeliculaDTO> Listar();
}
