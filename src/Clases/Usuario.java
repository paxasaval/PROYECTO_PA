/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jorge
 */
public class Usuario {
    
    public String cedula, claveAcceso;

    public Usuario() {
    }

    public Usuario(String cedula, String claveAcceso) {
        this.cedula = cedula;
        this.claveAcceso = claveAcceso;
    }

    public String getCedula() {
        return cedula;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }
    
    
    
}
