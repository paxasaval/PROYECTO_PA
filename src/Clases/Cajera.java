package Clases;


import java.util.*;

public class Cajera extends Personas {
    
    public int NumCaja;
    public String Codigo;
    public Pedido pedido;

    public Cajera() {
    }

    public Cajera(int NumCaja, String Codigo, Pedido pedido, String Cedula, String PrimApellido, String SegApellido, String PrimNombre, String SegNombre) {
        super(Cedula, PrimApellido, SegApellido, PrimNombre, SegNombre);
        this.NumCaja = NumCaja;
        this.Codigo = Codigo;
        this.pedido = pedido;
    }

    public Cajera(int NumCaja, String Codigo, Pedido pedido) {
        this.NumCaja = NumCaja;
        this.Codigo = Codigo;
        this.pedido = pedido;
    }
    
    

    
    
    

    


}