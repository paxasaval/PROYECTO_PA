package Clases;


import java.util.*;

/**
 * 
 */
public class Pedido {

    public int NumOrden;
    public String Estado;
    public int NumMesa;
    public int Tiempo_Espera;
    public Plato plato;
    public Estado estado;
    
    public Pedido() {
    }

    public Pedido(int NumOrden, String Estado, int NumMesa, int Tiempo_Espera, Plato plato) {
        this.NumOrden = NumOrden;
        this.Estado = Estado;
        this.NumMesa = NumMesa;
        this.Tiempo_Espera = Tiempo_Espera;
        this.plato = plato;
        
    }

    public int getNumOrden() {
        return NumOrden;
    }

    public String getEstado() {
        return Estado;
    }

    public int getNumMesa() {
        return NumMesa;
    }

    public int getTiempo_Espera() {
        return Tiempo_Espera;
    }

    public Plato getPlato() {
        return plato;
    }

//    public Estado getEstado() {
//        return estado;
//    }

    
    
    


}