package lesson7_connect_jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import lesson5.SanPham;

public class DemoConnect {
    public static void main(String[] args) {
        try {
            // B1: Load Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // B2: Kết nối
            String dbUser = "sa", dbPass = "Aa@123456",
                dbUrl = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=su22b2_sof203";
            
            Connection conn = DriverManager
                .getConnection(dbUrl, dbUser, dbPass);
            
            System.out.println("Kết nối thành công");
            
            SanPham sp = new SanPham(0, "Ao 123", 10, 100000, "WHITE", 1);
            String query = "INSERT INTO san_pham"
                + "(ten, so_luong, mau_sac, don_gia, danh_muc_id) "
                + "VALUES (?, ?, ?, ?, ?)";
            //             1  2  3  4  5

            // B3: Tạo PreparedStatement
            PreparedStatement ps = conn.prepareStatement(query);
            
            // B4: Gán giá trị tham số
            ps.setString(1, sp.getTenSP());
            ps.setInt(2, sp.getSoLuong());
            ps.setString(3, sp.getMauSac());
            ps.setDouble(4, sp.getDonGia());
            ps.setInt(5, sp.getDanhMucId());
            
            // B5: Thực thi
            ps.execute();
            System.out.println("Thực thi thành công");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
