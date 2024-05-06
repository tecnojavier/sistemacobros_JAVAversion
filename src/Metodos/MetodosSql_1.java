package Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author TECNOJAVIER
 */
public class MetodosSql_1 {
    public void accesoUsuario(String user, String password) {
        ConexionDB db = new ConexionDB();

        try {
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT UserAdmin, Password FROM user WHERE UserAdmin = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String usuarioCorrecto = rs.getString("UserAdmin");
                String passwordCorrecto = rs.getString("Password");

                if (user.equals(usuarioCorrecto) && password.equals(passwordCorrecto)) {
                    JOptionPane.showMessageDialog(null, "Login correcto. Bienvenido!\n" + user + " (Invitado)");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no está registrado");
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
}
