package manager;

import java.sql.*;
import java.util.Properties;

public class DBManager {

    public static Connection conectar(String url, Properties info) throws SQLException {
        return DriverManager.getConnection(url, info);
    }

    public static void cerrarConexion(Connection conn) throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

}
