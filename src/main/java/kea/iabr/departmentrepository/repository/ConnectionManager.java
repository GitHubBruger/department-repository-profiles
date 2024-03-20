package kea.iabr.departmentrepository.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection connection;

    private ConnectionManager() {
    }

    public static Connection getConnection(String db_url, String uid, String pwd) {
        if (connection != null) return connection;
        try {
            connection = DriverManager.getConnection(db_url, uid, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
