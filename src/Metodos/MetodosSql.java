package Metodos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MetodosSql {

    public void accesoUsuario(String user, String password) {
        ConexionDB db = new ConexionDB();

        try {
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT Usuario, Clave FROM usuario WHERE Usuario = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String usuarioCorrecto = rs.getString("Usuario");
                String passwordCorrecto = rs.getString("Clave");

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
