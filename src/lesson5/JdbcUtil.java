package lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JdbcUtil {
    private static Connection conn;
    
    public static Connection getConnection()
    {
        if (JdbcUtil.conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "Aa@123456",
                    dbUrl = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=su22b2_sof203";
                Connection conn = DriverManager
                    .getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return JdbcUtil.conn;
    }
}
