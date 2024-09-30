/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;


import Controller.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

/**
 *
 * @author jbarr
 */
public class Modificar extends javax.swing.JDialog {

    /**
     * Creates new form Modificar
     */
    public Modificar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t_ID = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        t_Titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t_Director = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_Annio = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        t_Duracion = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        t_Genero = new javax.swing.JTextField();
        b_Limpiar = new javax.swing.JButton();
        b_Modificar = new javax.swing.JButton();
        b_Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("ID");

        t_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_IDActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo");

        jLabel3.setText("Director");

        t_Director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_DirectorActionPerformed(evt);
            }
        });

        jLabel4.setText("Año");

        jLabel5.setText("Duración (min)");

        t_Duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_DuracionActionPerformed(evt);
            }
        });

        jLabel6.setText("Género");

        b_Limpiar.setText("Limpiar");
        b_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LimpiarActionPerformed(evt);
            }
        });

        b_Modificar.setText("Modificar Pelicula");
        b_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ModificarActionPerformed(evt);
            }
        });

        b_Buscar.setText("Buscar Pelicula");
        b_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(t_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                            .addComponent(t_Titulo)
                            .addComponent(t_Director)
                            .addComponent(t_Genero)
                            .addComponent(t_Annio)
                            .addComponent(t_Duracion))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_Modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b_Buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(t_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(t_Director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(t_Annio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(t_Duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(t_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(b_Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_Modificar)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_IDActionPerformed

    private void t_DirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_DirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_DirectorActionPerformed

    private void t_DuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_DuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_DuracionActionPerformed

    private void b_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LimpiarActionPerformed
        // TODO add your handling code here:
        t_ID.setText(null);
        t_Titulo.setText(null);
        t_Director.setText(null);
        t_Annio.setText(null);
        t_Duracion.setText(null);
        t_Genero.setText(null);
    }//GEN-LAST:event_b_LimpiarActionPerformed

    private void b_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ModificarActionPerformed
        // TODO add your handling code here:
        
        Connection con;
        try{
          
           con = DatabaseConnection.Main();
           
           PreparedStatement ps;
           String tabla = "movies";         
           
           ps = con.prepareStatement("UPDATE " + tabla + " SET id=?, titulo=?, director=?, annio=?, duracion=?, genero=? WHERE id=?");
           
           ps.setString(1, t_ID.getText());
           ps.setString(2, t_Titulo.getText());
           ps.setString(3, t_Director.getText());
           ps.setString(4, t_Annio.getText());
           ps.setString(5, t_Duracion.getText());
           ps.setString(6, t_Genero.getText());
           
           ps.setString(7, t_ID.getText());
           
           int res1 = ps.executeUpdate();
           
           if(res1>0){
               JOptionPane.showMessageDialog(null, "Pelicula " + t_Titulo.getText() + " modificada");
           } else {
               JOptionPane.showMessageDialog(null, "Error al modificar pelicula");
           }         
           
           con.close();
           
       }catch(SQLIntegrityConstraintViolationException io){
           JOptionPane.showMessageDialog(null, "[Error] ID Duplicado");
       } catch(Exception e){
           System.out.println(e);
       }
        
        
        
    }//GEN-LAST:event_b_ModificarActionPerformed

    private void b_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_BuscarActionPerformed
        // TODO add your handling code here:
        Connection con;
        try{

            con = DatabaseConnection.Main();
            PreparedStatement ps;
            ResultSet rs;
            String tabla = "movies";

            ps = con.prepareStatement("SELECT * FROM " + tabla + " WHERE id = ?");

            ps.setString(1, t_ID.getText());
            rs = ps.executeQuery();

            if(rs.next()){
                t_ID.setText(rs.getString("id"));
                t_Titulo.setText(rs.getString("titulo"));
                t_Director.setText(rs.getString("director"));
                t_Annio.setText(rs.getString("annio"));
                t_Duracion.setText(rs.getString("duracion"));
                t_Genero.setText(rs.getString("genero"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe ID de pelicula");
                t_ID.setText(null);
                t_Titulo.setText(null);
                t_Director.setText(null);
                t_Annio.setText(null);
                t_Duracion.setText(null);
                t_Genero.setText(null);
            }

            con.close();

        }catch(SQLIntegrityConstraintViolationException io){
            JOptionPane.showMessageDialog(null, "[Error] ID Duplicado");
        } catch(Exception e){
            System.out.println(e);
        }

    }//GEN-LAST:event_b_BuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modificar dialog = new Modificar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Buscar;
    private javax.swing.JButton b_Limpiar;
    private javax.swing.JButton b_Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField t_Annio;
    private javax.swing.JTextField t_Director;
    private javax.swing.JFormattedTextField t_Duracion;
    private javax.swing.JTextField t_Genero;
    private javax.swing.JFormattedTextField t_ID;
    private javax.swing.JTextField t_Titulo;
    // End of variables declaration//GEN-END:variables
}
