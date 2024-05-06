package Views;

import Metodos.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TECNOJAVIER
 */
public class Buscar extends javax.swing.JFrame {

    public Buscar() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarRegistros();
        mostrarRegistros1();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDUI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistros1 = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(188, 152, 243));

        jLabel5.setBackground(new java.awt.Color(220, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 255, 255));
        jLabel5.setText("BÚSQUEDA");

        jLabel7.setBackground(new java.awt.Color(0, 0, 51));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(220, 255, 255));
        jLabel7.setText("DUI:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setBackground(new java.awt.Color(0, 0, 51));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("USUARIOS:");

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblRegistros);

        jLabel9.setBackground(new java.awt.Color(0, 0, 51));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("COBROS:");

        tblRegistros1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblRegistros1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnBuscar.setBackground(new java.awt.Color(80, 134, 193));
        btnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(220, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(80, 134, 193));
        btnSalir.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(220, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 51));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(220, 255, 255));
        jLabel13.setText("©TecnoJavier");

        jLabel11.setBackground(new java.awt.Color(0, 0, 51));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(220, 255, 255));
        jLabel11.setText("Comité de Agua Las Isletas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(90, 90, 90)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(43, 43, 43)
                .addComponent(jLabel13)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ConexionDB db = new ConexionDB();
        int opcion = 1;
        switch (opcion) {
            case 1:
                DefaultTableModel model = (DefaultTableModel) tblRegistros1.getModel();
                model.setRowCount(0);

                String dui = txtDUI.getText();
                if (dui.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete el campo DUI para \n realizar la busqueda.");
                } else {
                    try {
                        Connection cn = db.conectar();
                        PreparedStatement pst = cn.prepareStatement("SELECT * FROM cliente WHERE Dui = ?");
                        pst.setString(1, dui);

                        ResultSet res = pst.executeQuery();
                        if (res.next()) {
                            do {
                                Object[] fila = new Object[5];
                                fila[0] = res.getString("NoFactura");
                                fila[1] = res.getString("Nombre");
                                fila[2] = res.getString("Apellido");
                                fila[3] = res.getString("Direccion");
                                fila[4] = res.getString("Dui");
                                model.addRow(fila);
                            } while (res.next());
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            case 2:
                DefaultTableModel model1 = (DefaultTableModel) tblRegistros.getModel();
                model1.setRowCount(0);

                String dui2 = txtDUI.getText();
                if (dui2.isEmpty()) {
                } else {
                    try {
                        Connection cn = db.conectar();
                        PreparedStatement pst = cn.prepareStatement("SELECT * FROM registro WHERE Dui = ? ORDER BY Fecha DESC LIMIT 100");
                        pst.setString(1, dui2);

                        ResultSet res = pst.executeQuery();
                        if (res.next()) {
                            do {
                                Object[] fila = new Object[8];
                                fila[0] = res.getString("NoFactura");
                                fila[1] = res.getString("Nombre");
                                fila[2] = res.getString("Apellido");
                                fila[3] = res.getString("Fecha");
                                fila[4] = res.getString("Monto");
                                fila[5] = res.getString("CantidaMeses");
                                fila[6] = res.getString("Concepto");
                                fila[7] = res.getString("Dui");
                                model1.addRow(fila);
                            } while (res.next());
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    JOptionPane.showMessageDialog(null, "Registro encontrado!");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "El registro que está buscando no existe.");
                break;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Home1 mostrar = new Home1();
        mostrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void mostrarRegistros() {
        ConexionDB db = new ConexionDB();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("NoRecibo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Dui");

        try {
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM cliente");
            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Object[] fila = new Object[6];
                fila[0] = res.getString("NoFactura");
                fila[1] = res.getString("Nombre");
                fila[2] = res.getString("Apellido");
                fila[3] = res.getString("Direccion");
                fila[4] = res.getString("Dui");
                modelo.addRow(fila);
            }
            tblRegistros1.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void mostrarRegistros1() {
        ConexionDB db = new ConexionDB();
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("NoRecibo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha");
        modelo.addColumn("Monto");
        modelo.addColumn("CantidaMeses");
        modelo.addColumn("Concepto");
        modelo.addColumn("Dui");

        try {
            Connection cn = db.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM registro ORDER BY Fecha DESC LIMIT 100");
            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Object[] fila = new Object[8];
                fila[0] = res.getString("NoFactura");
                fila[1] = res.getString("Nombre");
                fila[2] = res.getString("Apellido");
                fila[3] = res.getString("Fecha");
                fila[4] = res.getString("Monto");
                fila[5] = res.getString("CantidaMeses");
                fila[6] = res.getString("Concepto");
                fila[7] = res.getString("Dui");
                modelo.addRow(fila);
            }
            tblRegistros.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTable tblRegistros1;
    private javax.swing.JTextField txtDUI;
    // End of variables declaration//GEN-END:variables

    void setText(String administrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
