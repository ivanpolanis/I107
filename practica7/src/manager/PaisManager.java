package manager;

import java.sql.*;
import java.util.Scanner;

import entities.Pais;

import static utils.Input.obtenerInput;

public class PaisManager {
    public static void registrarPais(Connection conn) {
        Scanner scan = new Scanner(System.in);

        String nombre= obtenerInput("Ingrese el nombre del pais: ",scan);
        String idioma = obtenerInput("Ingrese el idioma del pais: ",scan);
        Pais pais = new Pais(nombre,idioma);
        try {
            if (existePais(conn,pais.getNombre())) {
                System.out.println("El país ingresado se encuentra registrado en la base de datos.");
            } else {
                insertarPais(conn,pais);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void mostrarPaises(Connection conn) throws SQLException{
        String query = "SELECT * FROM pais";
        try (Statement st = conn.createStatement()){
            try (ResultSet resultSet = st.executeQuery(query)) {
                while(resultSet.next()){
                    System.out.println(resultSet.getInt("idpais") + " " + resultSet.getString("nombre"));
                }
            }
        }
    }

    private static boolean existePais(Connection conn, String nombrePais) throws SQLException {
        String sql = "SELECT * FROM pais WHERE nombre = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, nombrePais);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        }
    }

    private static void insertarPais(Connection conn, Pais pais) throws SQLException {
        String sql = "INSERT INTO pais (nombre, idioma) VALUES (?, ?)";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, pais.getNombre());
            statement.setString(2, pais.getIdioma());
            statement.executeUpdate();
        }
    }
}
