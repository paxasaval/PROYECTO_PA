/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.Restaurante;
import Clases.Usuario;
import DATA.Imp_Usuarios;
import DATA.PreListar;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class ManUsuario {

    public Usuario CrearUsuario (String cedula, String claveAcceso){
        Usuario objUsu = new Usuario(cedula, claveAcceso);
        return objUsu;
    }

    public ArrayList<Usuario> AgregarUsuario (ArrayList<Usuario> ArrayUsuario, String cedula, String claveAcceso){
        Usuario objUsu = new Usuario(cedula, claveAcceso);
        ArrayUsuario.add(objUsu);
        return ArrayUsuario;
    }
<<<<<<< HEAD
    
    public ArrayList<Usuario> ImportarUsuarios(ArrayList<Usuario> ArrayUsuarios, String user, String pass){
=======

    public Imp_Usuarios ImportarUsuarios(String [] usuario, String user, String pass){
>>>>>>> 03dae13a3ccf12782e4961c4fdb46ca3316b0b49
        Imp_Usuarios objImpUsu = new Imp_Usuarios();
        objImpUsu.LeerUsers(ArrayUsuarios, user, pass);
        return ArrayUsuarios;
    }
    
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
