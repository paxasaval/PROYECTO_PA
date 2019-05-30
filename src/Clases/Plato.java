package Clases;


import java.util.*;

public class Plato {
    
    public String Nombre_Plato;
    public double Precio;
    public String Detalle;
    public Pedido pedido;
 
    public Plato() {
    }

    public Plato(String Nombre_Plato, double Precio, String Detalle) {
        this.Nombre_Plato = Nombre_Plato;
        this.Precio = Precio;
        this.Detalle = Detalle;
    }
    
    public Plato(String Nombre_Plato, double Precio, String Detalle, Pedido pedido) {
        this.Nombre_Plato = Nombre_Plato;
        this.Precio = Precio;
        this.Detalle = Detalle;
        this.pedido = pedido;
    }
    
    public Plato(String Nombre_Plato, double Precio){
        this.Nombre_Plato = Nombre_Plato;
        this.Precio = Precio;
    }

    public void setNombre_Plato(String Nombre_Plato) {
        this.Nombre_Plato = Nombre_Plato;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public String getNombre_Plato() {
        return Nombre_Plato;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getDetalle() {
        return Detalle;
    }
    
    
    

   



}