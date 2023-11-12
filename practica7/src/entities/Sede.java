package entities;

public class Sede {
    private String nombre;
    private int capacidad;
    private int idPais;

    public Sede(String nombre, int capacidad, int idPais) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getIdPais() {
        return idPais;
    }

}
