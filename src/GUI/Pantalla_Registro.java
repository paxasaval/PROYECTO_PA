/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Cliente;
import Clases.Personas;
import Clases.Usuario;
import DATA.ListarCliente;
import DATA.PreListar;
import LOGICA.Expresiones;
import LOGICA.ManCliente;
import LOGICA.ManUsuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Pantalla_Registro extends javax.swing.JFrame {

    ManCliente objManCli = new ManCliente();
    ManUsuario objManUsu = new ManUsuario();
    ArrayList<Cliente> ArrayCliente = new ArrayList<>();
    ArrayList<Usuario> ArrayUsuario = new ArrayList<>();

    /**
     * Creates new form Pantalla_Registro
     */
    public Pantalla_Registro() {
        initComponents();
        this.jButtonRegistrarse.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPrimNombre = new javax.swing.JTextField();
        jTextFieldSegNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrimApellido = new javax.swing.JTextField();
        jTextFieldSegApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTarjeta = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButtonRevisar = new javax.swing.JButton();
        jButtonRegistrarse = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("*Deben de llenarse obligatoriamente cada uno de los campos requeridos*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("Primer Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel4.setText("Segundo Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));
        jPanel2.add(jTextFieldPrimNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, -1));
        jPanel2.add(jTextFieldSegNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 200, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel5.setText("Primer Apellido");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel6.setText("Segundo Apellido");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));
        jPanel2.add(jTextFieldPrimApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 200, -1));
        jPanel2.add(jTextFieldSegApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 200, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel7.setText("Cedula");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel2.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 200, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel8.setText("Correo Electrónico");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel2.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 360, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel10.setText("N° Tarjeta Crédito");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));
        jPanel2.add(jTextFieldTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 120, -1));
        jPanel2.add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel11.setText("*Mínimo 8 caracteres*");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, 30));

        jButtonRevisar.setText("Revisar");
        jButtonRevisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRevisarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRevisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel12.setText("Direccion");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel2.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 550, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel13.setText("Telefono");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        jPanel2.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 710, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        dispose();
        Pantalla_Principal Prin = new Pantalla_Principal();
        Prin.setVisible(true);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        // TODO add your handling code here:
        Cliente objCli = new Cliente();
        Usuario objUsu = new Usuario();
        ListarCliente lis=new ListarCliente();
        
        
//        Personas objPer = new Personas();
        objCli=this.objManCli.NuevoCliente(Long.valueOf(this.jTextFieldTarjeta.getText()), Integer.valueOf(this.jTextFieldContraseña.getText()), this.jTextFieldDireccion.getText(),
                this.jTextFieldCorreo.getText(), Integer.valueOf(this.jTextFieldTelefono.getText()), this.jTextFieldCedula.getText(),
                this.jTextFieldPrimApellido.getText(), this.jTextFieldSegApellido.getText(),
                this.jTextFieldPrimNombre.getText(), this.jTextFieldSegNombre.getText());
        
        objUsu = this.objManUsu.CrearUsuario(this.jTextFieldCedula.getText(), this.jTextFieldContraseña.getText());

        this.objManCli.AgregarCliente(ArrayCliente,Long.valueOf(this.jTextFieldTarjeta.getText()), Integer.valueOf(this.jTextFieldContraseña.getText()), this.jTextFieldDireccion.getText(),
                this.jTextFieldCorreo.getText(), Integer.valueOf(this.jTextFieldTelefono.getText()), this.jTextFieldCedula.getText(),
                this.jTextFieldPrimApellido.getText(), this.jTextFieldSegApellido.getText(),
                this.jTextFieldPrimNombre.getText(), this.jTextFieldSegNombre.getText());
        
        this.objManUsu.AgregarUsuario(ArrayUsuario, this.jTextFieldCedula.getText(), this.jTextFieldContraseña.getText());
        
        Pantalla_Principal objPanPrin = new Pantalla_Principal();

        System.out.println("USUARIO REGISTRADO CON EXITO");
        try {
            //        System.out.println(objPer.toString());
//        System.out.println(objCli.toString());
            lis.escribirCliente(objCli);
            
        } catch (IOException ex) {
            Logger.getLogger(Pantalla_Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //        System.out.println(objPer.toString());
//        System.out.println(objCli.toString());
            lis.escribirUsuario(objUsu);
        } catch (IOException ex) {
            Logger.getLogger(Pantalla_Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private void jButtonRevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRevisarActionPerformed
        // TODO add your handling code here:
        Expresiones comprobar = new Expresiones();
        Cliente objCli = new Cliente();
        if (this.jTextFieldPrimNombre.getText().isEmpty()
                
                || this.jTextFieldSegNombre.getText().isEmpty()
                || this.jTextFieldPrimApellido.getText().isEmpty() 
                || this.jTextFieldSegApellido.getText().isEmpty()
                || this.jTextFieldCedula.getText().isEmpty()
                || this.jTextFieldTarjeta.getText().isEmpty()
                || this.jTextFieldTelefono.getText().isEmpty()
                || this.jTextFieldCorreo.getText().isEmpty()
               || (this.jTextFieldContraseña.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "TIENE CAMPOS FALTANTES POR LLENAR");
        } else if (!comprobar.numeroCedula(this.jTextFieldCedula.getText())){
            JOptionPane.showMessageDialog(null, "CEDULA INVALIDA");
        }else if(!comprobar.numeroTarjeta(this.jTextFieldTarjeta.getText())){
            JOptionPane.showMessageDialog(null, "NUMERO DE TARJETA INVALIDO");
        }else if(!comprobar.numeroCelular(this.jTextFieldTelefono.getText())){
            JOptionPane.showMessageDialog(null, "NUMERO DE TELEFONO INVALIDO");
        }else if(!comprobar.mailValiodo(this.jTextFieldCorreo.getText())){
            JOptionPane.showMessageDialog(null, "CORREO ELECTRONICO INVALIDO");
        }else if(!comprobar.contrasenia(this.jTextFieldContraseña.getText())){
            JOptionPane.showMessageDialog(null, "CONTRASEÑA INVALIDA");
        }else{     
            this.jButtonRegistrarse.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonRevisarActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JButton jButtonRevisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldPrimApellido;
    private javax.swing.JTextField jTextFieldPrimNombre;
    private javax.swing.JTextField jTextFieldSegApellido;
    private javax.swing.JTextField jTextFieldSegNombre;
    private javax.swing.JTextField jTextFieldTarjeta;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
