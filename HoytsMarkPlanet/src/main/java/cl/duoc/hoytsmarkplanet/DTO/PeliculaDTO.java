package cl.duoc.hoytsmarkplanet.DTO;

public class PeliculaDTO {
    private int id;
    private String titulo;
    private String director;
    private int annio;
    private int duración;
    private String genero;

    public PeliculaDTO(int id, String titulo, String director, int annio, int duración, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.annio = annio;
        this.duración = duración;
        this.genero = genero;
    }

    public PeliculaDTO() {
        this.id = 0;
        this.titulo = "";
        this.director = "";
        this.annio = 0;
        this.duración = 0;
        this.genero = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

     
 @Override
    public String toString(){
        return id+"-"+ this.titulo + " Dirigida por "+ this.director + "el año"+annio+"con una duración de "+duración+"del genro"+this.genero;
            
    }   
}

