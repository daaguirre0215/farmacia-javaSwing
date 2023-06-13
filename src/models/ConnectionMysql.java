package models;

import com.sun.source.tree.ReturnTree;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMysql {

    private String name_database = "pharmacy_database";
    private String username = "root";
    private String password = "12345";
    private String urlConnection = "jdbc:mysql://localhost:3306/" + name_database;

    Connection cn = null;

    public Connection getConnection() {
        try {
            //obtener valor del driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Obtener la conexion
            cn = DriverManager.getConnection(urlConnection, username, password);

        } catch (ClassNotFoundException e) {
            System.err.println("Ha ocurrido un error en la conexion" + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Ha ocurrido un SSQLException" + e.getMessage());

        }
        return cn;
    }

}
