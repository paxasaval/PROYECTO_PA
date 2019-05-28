package Clases;


import java.util.*;

public class Cajera extends Personas {
    
    public int NumCaja;
    public String Codigo;

    public Cajera() {
    }

    public Cajera(int NumCaja, String Codigo, String Cedula, String PrimApellido, String SegApellido, String PrimNombre, String SegNombre) {
        super(Cedula, PrimApellido, SegApellido, PrimNombre, SegNombre);
        this.NumCaja = NumCaja;
        this.Codigo = Codigo;
    }

    
    
    

    


}