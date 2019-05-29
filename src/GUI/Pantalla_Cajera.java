/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Clases.Plato;
import Clases.Restaurante;
import LOGICA.ManPlato;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class Pantalla_Cajera extends javax.swing.JFrame {
    ArrayList<Plato> ArrayPlato = new ArrayList<>();
    ManPlato objManPla = new ManPlato();

    /** Creates new form Pantalla_Cajera */
    public Pantalla_Cajera() {
        initComponents();
        ArrayPlato = objManPla.ImportarPedidos(ArrayPlato);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        jLabel1.setText("MENÚ CAJERA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 80));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("PEDIDOS ENTRANTES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
        jTable1.removeAll();
        Object columnas[] = {"NUMERO PLATO", "PRECIO COMIDA", "DETALLE", "NUM MESA", "TIEMPO ESPERA", "NUM ORDEN", "ESTADO"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        jTable1.setModel(modelo);
        for (Plato objPla : ArrayPlato) {
            String NewValor[] = {objPla.getNombre_Plato(), Integer.toString((int)(objPla.getPrecio())), objPla.getDetalle(),
                Integer.toString(objPla.pedido.getNumMesa()),Integer.toString(objPla.pedido.getTiempo_Espera()),
                Integer.toString(objPla.pedido.getNumOrden()), objPla.pedido.getEstado()
                
            };
            modelo.addRow(NewValor);
        }
    }//GEN-LAST:event_jButtonListarActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Cajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Cajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Cajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Cajera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Cajera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
