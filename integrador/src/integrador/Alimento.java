package integrador;

public class Alimento {
    private String nombre;
    private EstadoAlimento estado;

    public Alimento(String nombre, EstadoAlimento estado){
        this.nombre = nombre;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }

    public Alimento pudrirAlimento(){
        if (estado != EstadoAlimento.PUTREFACTO) this.estado = EstadoAlimento.PUTREFACTO;
        return this;
    }

}
