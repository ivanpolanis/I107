package manager;

import entities.Jugador;
import java.util.Scanner;

import java.sql.*;

import static manager.PaisManager.mostrarPaises;
import static utils.Input.obtenerInput;

public class JugadorManager {
    public static void registrarJugador(Connection conn) throws SQLException {
        Scanner scan = new Scanner(System.in);

        String nombre = obtenerInput("Ingrese el nombre del jugador: ",scan);
        String apellido = obtenerInput("Ingrese el apellido del jugador: ",scan);
        String docId = obtenerInput("Ingrese el documento del jugador: ",scan);
        String telefono = obtenerInput("Ingrese el telefono del jugador: ",scan);
        String email= obtenerInput("Ingrese el mail del jugador: ",scan);


        try{
            mostrarPaises(conn);
        } catch (SQLException e) {
            System.out.println(e);
        }

        int idPais= Integer.parseInt(obtenerInput("Ingrese el id del pais: ",scan));

        Jugador jugador = new Jugador(nombre, apellido, docId, telefono, email, idPais);

        System.out.println("Los datos ingresados son: ");
        jugador.mostrarJugador();
        System.out.println("Desea guardarlo en la base de datos? (S/n)");

        String respuesta = scan.nextLine();

        if (!respuesta.equalsIgnoreCase("N")) {
            try {
                insertarJugador(conn,jugador);
            } catch (SQLException e) {
                System.out.println(e);
            }
        }

    }
    private static void insertarJugador(Connection conn, Jugador jugador) throws SQLException {
        String sql = "INSERT INTO futbolista (nombre, apellido, docIdentidad, telefono, email, idPais) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, jugador.getNombre());
            statement.setString(2, jugador.getApellido());
            statement.setString(3, jugador.getDocIdentidad());
            statement.setString(4, jugador.getTelefono());
            statement.setString(5, jugador.getEmail());
            statement.setInt(6, jugador.getIdPais());
            statement.executeUpdate();
            System.out.println("entities.Jugador guardado correctamente.");
        }
    }

    public static void mostrarJugadores(Connection conn) throws SQLException{
        String query = "SELECT * FROM futbolista";
        try (Statement st = conn.createStatement()){
            try (java.sql.ResultSet resultSet = st.executeQuery(query)) {
                while(resultSet.next()){
                    System.out.println(resultSet.getInt("idfutbolista") + " " + resultSet.getString("nombre") + " " + resultSet.getString("apellido"));
                }
            }
        }
    }
}
