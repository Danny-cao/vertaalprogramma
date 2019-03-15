package persistence;

import java.sql.*;


public class OracleBaseDao {

    private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/oracledb";
    private static final String DB_USER = "danny";
    private static final String DB_PASS = "1234";

    public Connection getConnection() throws SQLException {
        try {
            Class.forName(DB_DRIV).newInstance();
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    public void closeConnection(Connection conn) throws SQLException{
        conn.close();
    }
}