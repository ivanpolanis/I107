import manager.DBManager;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

import static manager.JugadorManager.mostrarJugadores;
import static manager.JugadorManager.registrarJugador;
import static manager.PaisManager.mostrarPaises;
import static manager.PaisManager.registrarPais;
import static manager.SedeManager.mostrarSedes;
import static manager.SedeManager.registrarSede;

public class Main {
    public static void main(String[] args) {
        StringBuilder url = new StringBuilder();
        Properties info = new Properties();

        leerEntrada(url,info);

        Connection conn = null;
        try {
            conn = DBManager.conectar(url.toString(), info);
            if (conn != null) {
                while (menu(conn)) ;
                DBManager.cerrarConexion(conn);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static boolean menu(Connection conn) throws SQLException {
        System.out.println("1. Registrar pais");
        System.out.println("2. Registrar jugador");
        System.out.println("3. Registrar sede");
        System.out.println("4. Lista de paises");
        System.out.println("5. Lista de jugadores");
        System.out.println("6. Lista de sedes");
        System.out.println("0. Salir");
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese una opcion: ");
        int opcion = scan.nextInt();
        switch (opcion) {
            case 0:
                return false;
            case 1:
                registrarPais(conn);
                break;
            case 2:
                registrarJugador(conn);
                break;
            case 3:
                registrarSede(conn);
                break;
            case 4:
                mostrarPaises(conn);
                break;
            case 5:
                mostrarJugadores(conn);
                break;
            case 6:
                mostrarSedes(conn);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println();
        return true;
    }

    public static void leerEntrada(StringBuilder url, Properties info){
        String base_url = "jdbc:mariadb://localhost:3306/";

        Scanner scan = new Scanner(System.in);

        //String db_name = obtenerInput("Ingrese el nombre de la base de datos: ", scan) ;
        //String db_user = obtenerInput("Ingrese el usuario: ",scan);
        //String db_pass = obtenerInput("Ingrese la contraseña: ",scan);
        String db_name = "mundial_futbol_2022";
        String db_user = "root";
        String db_pass = "ivanivan";
        info.put("user",db_user);
        info.put("password",db_pass);

        url.append(base_url).append(db_name);
    }


}