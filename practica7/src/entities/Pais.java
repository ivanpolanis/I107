package entities;

public class Pais {
    private String nombre;
    private String idioma;

    public Pais(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }
}
