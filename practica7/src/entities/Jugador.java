package entities;

public class Jugador {

    private String nombre;
    private String apellido;
    private String docIdentidad;
    private String telefono;
    private String email;
    private int idPais;

    public Jugador(String nombre, String apellido, String docIdentidad, String telefono, String email, int idPais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.docIdentidad = docIdentidad;
        this.telefono = telefono;
        this.email = email;
        this.idPais = idPais;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public String getTelefono() {
        return telefono;
    }


    public String getEmail() {
        return email;
    }

    public int getIdPais() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }


    public void mostrarJugador() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Documento de identidad: " + docIdentidad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
        System.out.println("Id entities.Pais: " + idPais);
    }
}
