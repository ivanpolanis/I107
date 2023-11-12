package manager;

import java.sql.*;
import java.util.Scanner;

import entities.Sede;

import static manager.PaisManager.mostrarPaises;
import static utils.Input.obtenerInput;

public class SedeManager {
    public static void registrarSede(Connection conn) throws SQLException {
        Scanner scan = new Scanner(System.in);

        String nombre = obtenerInput("Ingrese el nombre de la sede: ",scan);
        int capacidad = Integer.parseInt(obtenerInput("Ingrese la capacidad de la sede: ",scan));

        try{
            mostrarPaises(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        int idPais= Integer.parseInt(obtenerInput("Ingrese el id del pais: ",scan));

        Sede sede = new Sede(nombre,capacidad,idPais) ;

        if(existeSede(conn, sede.getNombre())) {
            System.out.println("La sede ingresada se encuentra registrada en la base de datos.");
            return;
        }

        try {
            insertarSede(conn, sede);
            System.out.println("entities.Sede guardada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void mostrarSedes(Connection conn) throws SQLException{
        String query = "SELECT * FROM sede";
        try (Statement st = conn.createStatement()){
            try (ResultSet resultSet = st.executeQuery(query)) {
                while(resultSet.next()){
                    System.out.println(resultSet.getInt("idsede") + " " + resultSet.getString("nombre"));
                }
            }
        }
    }

    private static boolean existeSede(Connection conn, String nombre) throws SQLException{
        String sql = "SELECT * FROM sede WHERE nombre = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, nombre);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        }
    }
    private static void insertarSede(Connection conn, Sede sede) throws SQLException {
        String sql = "INSERT INTO sede (nombre, capacidad, idPais) VALUES (?, ?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, sede.getNombre());
            statement.setInt(2, sede.getCapacidad());
            statement.setInt(3, sede.getIdPais());
            statement.executeUpdate();
            System.out.println("entities.Sede guardada correctamente.");
        }
    }
}
