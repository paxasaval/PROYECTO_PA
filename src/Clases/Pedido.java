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

    public Pedido(int NumOrden, String Estado, int NumMesa, int Tiempo_Espera, Plato plato, Estado estado) {
        this.NumOrden = NumOrden;
        this.Estado = Estado;
        this.NumMesa = NumMesa;
        this.Tiempo_Espera = Tiempo_Espera;
        this.plato = plato;
        this.estado = estado;
    }

    
    
    


}