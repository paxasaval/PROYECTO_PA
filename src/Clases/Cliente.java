package Clases;


import java.util.*;

/**
 * 
 */
public class Cliente extends Personas {

    public long NumTarjeta;
    public int Clave;
    public String Direccion;
    public String mail;
    public int telefono;
    public String usuario;
    public int claveAcceso;
    
    
    public Cliente() {
    }

    public Cliente(long NumTarjeta, int Clave, String Direccion, String mail, int telefono, String Cedula, 
            String PrimApellido, String SegApellido, String PrimNombre, String SegNombre) {
        super(Cedula, PrimApellido, SegApellido, PrimNombre, SegNombre);
        this.NumTarjeta = NumTarjeta;
        this.Clave = Clave;
        this.Direccion = Direccion;
        this.mail = mail;
        this.telefono = telefono;
    }
    
    public Cliente(String cedula, String PrimApellido, String SegApellido, String PrimNombre, String SegNombre){
        super(cedula, PrimApellido, SegApellido, PrimNombre, SegNombre);
    }

    public void setNumTarjeta(long NumTarjeta) {
        this.NumTarjeta = NumTarjeta;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setPrimApellido(String PrimApellido) {
        this.PrimApellido = PrimApellido;
    }

    public void setSegApellido(String SegApellido) {
        this.SegApellido = SegApellido;
    }

    public void setPrimNombre(String PrimNombre) {
        this.PrimNombre = PrimNombre;
    }

    public void setSegNombre(String SegNombre) {
        this.SegNombre = SegNombre;
    }

    public long getNumTarjeta() {
        return NumTarjeta;
    }

    public int getClave() {
        return Clave;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getMail() {
        return mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getClaveAcceso() {
        return claveAcceso;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getPrimApellido() {
        return PrimApellido;
    }

    public String getSegApellido() {
        return SegApellido;
    }

    public String getPrimNombre() {
        return PrimNombre;
    }

    public String getSegNombre() {
        return SegNombre;
    }

    

    

    

    

}