package Clases;


import java.util.*;

public class Plato {

    public String Nombre_Plato;
    public String Precio;
    public String Detalle;
    
    public Plato() {
    }

    public Plato(String Nombre_Plato, String Precio, String Detalle) {
        this.Nombre_Plato = Nombre_Plato;
        this.Precio = Precio;
        this.Detalle = Detalle;
    }
    
    public Plato(String Nombre_Plato, String Precio){
        this.Nombre_Plato = Nombre_Plato;
        this.Precio = Precio;
    }

    public void setNombre_Plato(String Nombre_Plato) {
        this.Nombre_Plato = Nombre_Plato;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public String getNombre_Plato() {
        return Nombre_Plato;
    }

    public String getPrecio() {
        return Precio;
    }

    public String getDetalle() {
        return Detalle;
    }
    
    
    

   



}