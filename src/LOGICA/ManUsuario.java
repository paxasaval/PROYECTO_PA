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
    
    public Imp_Usuarios ImportarUsuarios(String [] usuario, String user, String pass){
        Imp_Usuarios objImpUsu = new Imp_Usuarios();
        objImpUsu.LeerUsers(usuario, user, pass);
        return objImpUsu;
    }
    
}
