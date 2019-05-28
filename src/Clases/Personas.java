package Clases;


import java.util.*;

/**
 * 
 */
public class Personas {

    public String Cedula;
    public String PrimApellido;
    public String SegApellido;
    public String PrimNombre;
    public String SegNombre;
    
    public Personas() {
    }

    public Personas(String Cedula, String PrimApellido, String SegApellido, String PrimNombre, String SegNombre) {
        this.Cedula = Cedula;
        this.PrimApellido = PrimApellido;
        this.SegApellido = SegApellido;
        this.PrimNombre = PrimNombre;
        this.SegNombre = SegNombre;
    }

    @Override
    public String toString() {
        return "Personas{" + "Cedula=" + Cedula + ", PrimApellido=" + PrimApellido + ", SegApellido=" + SegApellido + ", PrimNombre=" + PrimNombre + ", SegNombre=" + SegNombre + '}';
    }

    
        
    

    

}