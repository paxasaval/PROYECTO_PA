/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Validacion {
    
    public void ValidarUsuario (String usuarios[], String user, String pwd){
        boolean encontrado = false;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equals(pwd)){
                encontrado = true;
                JOptionPane.showMessageDialog(null, "INICIO DE SESIÓN EXITOSO");
            }
        }
        if(encontrado == false){
            JOptionPane.showMessageDialog(null, "USUARIO Y/O CONTRASEÑA INCORRECTOS");
        }
    }
    
}
