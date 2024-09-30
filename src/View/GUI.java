/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jbarr
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Inicio = new javax.swing.JMenu();
        Menu_Conectar = new javax.swing.JMenuItem();
        Menu_Salir = new javax.swing.JMenuItem();
        Menu_Operaciones = new javax.swing.JMenu();
        Menu_Agregar = new javax.swing.JMenuItem();
        Menu_Modificar = new javax.swing.JMenuItem();
        Menu_Eliminar = new javax.swing.JMenuItem();
        Menu_Buscar = new javax.swing.JMenuItem();
        Menu_Listar = new javax.swing.JMenuItem();
        Menu_Info = new javax.swing.JMenu();
        Menu_About = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Menu_Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/house.png"))); // NOI18N
        Menu_Inicio.setText("Inicio");

        Menu_Conectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/connect_to_db.png"))); // NOI18N
        Menu_Conectar.setText("Conectar");
        Menu_Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ConectarActionPerformed(evt);
            }
        });
        Menu_Inicio.add(Menu_Conectar);

        Menu_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/exit.png"))); // NOI18N
        Menu_Salir.setText("Salir");
        Menu_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_SalirActionPerformed(evt);
            }
        });
        Menu_Inicio.add(Menu_Salir);

        jMenuBar1.add(Menu_Inicio);

        Menu_Operaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/operations.png"))); // NOI18N
        Menu_Operaciones.setText("Operaciones");

        Menu_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        Menu_Agregar.setText("Agregar");
        Menu_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_AgregarActionPerformed(evt);
            }
        });
        Menu_Operaciones.add(Menu_Agregar);

        Menu_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/modify.png"))); // NOI18N
        Menu_Modificar.setText("Modificar");
        Menu_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ModificarActionPerformed(evt);
            }
        });
        Menu_Operaciones.add(Menu_Modificar);

        Menu_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/del.png"))); // NOI18N
        Menu_Eliminar.setText("Eliminar");
        Menu_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_EliminarActionPerformed(evt);
            }
        });
        Menu_Operaciones.add(Menu_Eliminar);

        Menu_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        Menu_Buscar.setText("Buscar");
        Menu_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_BuscarActionPerformed(evt);
            }
        });
        Menu_Operaciones.add(Menu_Buscar);

        Menu_Listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/list.png"))); // NOI18N
        Menu_Listar.setText("Listar");
        Menu_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ListarActionPerformed(evt);
            }
        });
        Menu_Operaciones.add(Menu_Listar);

        jMenuBar1.add(Menu_Operaciones);

        Menu_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/info.png"))); // NOI18N
        Menu_Info.setText("Información");

        Menu_About.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/about.png"))); // NOI18N
        Menu_About.setText("Acerca de...");
        Menu_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_AboutActionPerformed(evt);
            }
        });
        Menu_Info.add(Menu_About);

        jMenuBar1.add(Menu_Info);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ConectarActionPerformed
        // Conectar
        try{
           Connection con;
           con = DatabaseConnection.Main();

           //con.close();
           
       }catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_Menu_ConectarActionPerformed

    private void Menu_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_EliminarActionPerformed
        // TODO add your handling code here:
    Eliminar del = new Eliminar(this, true);
    del.setVisible(true);
    }//GEN-LAST:event_Menu_EliminarActionPerformed

    private void Menu_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ListarActionPerformed
        // TODO add your handling code here:
        Listar list = new Listar(this, true);
        list.setVisible(true);
    }//GEN-LAST:event_Menu_ListarActionPerformed

    private void Menu_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_AboutActionPerformed
        // TODO add your handling code here:
        About about = new About(this, true);
        about.setVisible(true);
    }//GEN-LAST:event_Menu_AboutActionPerformed

    private void Menu_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_AgregarActionPerformed
        // TODO add your handling code here:
        Agregar add = new Agregar(this, true);
        add.setVisible(true);
    }//GEN-LAST:event_Menu_AgregarActionPerformed

    private void Menu_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ModificarActionPerformed
        // TODO add your handling code here:
        Modificar modify = new Modificar(this, true);
        modify.setVisible(true);
    }//GEN-LAST:event_Menu_ModificarActionPerformed

    private void Menu_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Menu_SalirActionPerformed

    private void Menu_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_BuscarActionPerformed
        // TODO add your handling code here:
        Buscar search = new Buscar(this,true);
        search.setVisible(true);
    }//GEN-LAST:event_Menu_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_About;
    private javax.swing.JMenuItem Menu_Agregar;
    private javax.swing.JMenuItem Menu_Buscar;
    private javax.swing.JMenuItem Menu_Conectar;
    private javax.swing.JMenuItem Menu_Eliminar;
    private javax.swing.JMenu Menu_Info;
    private javax.swing.JMenu Menu_Inicio;
    private javax.swing.JMenuItem Menu_Listar;
    private javax.swing.JMenuItem Menu_Modificar;
    private javax.swing.JMenu Menu_Operaciones;
    private javax.swing.JMenuItem Menu_Salir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
