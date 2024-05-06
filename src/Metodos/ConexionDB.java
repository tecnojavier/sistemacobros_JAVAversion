package Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    
    public static Connection con;
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/bdregistropago";
    
    public Connection conectar(){
        con = null;
        try{
            con = (Connection) DriverManager.getConnection(url,user,password);
            if(con!=null){
                
            }
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Error" + e.toString());
        }
        return con;
    }

    static class Clases {

        public Clases() {
        }
    }
}
