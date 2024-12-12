package mysqlConnect;

import java.sql.*;
import javax.swing.JOptionPane;

public class MysqlConnect {
    
    
    
public static Connection connectDB() {
   
    String host = "jdbc:mysql://127.0.0.1:3306/3com1?useSSL=true&useUnicode=yes&characterEncoding=UTF-8";
    String username = "root";
    String password = "";
    Connection conn = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(host, username, password);
        JOptionPane.showMessageDialog(null, "Connected");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return conn;
    }

    //ທົດສອບການເຊື່ອມຕໍ່ຖານຂໍ້ມູນ
    public static void main(String[] args) {
    MysqlConnect.connectDB();
    }
}
