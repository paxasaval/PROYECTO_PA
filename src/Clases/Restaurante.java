package Clases;


import java.util.*;

/**
 * 
 */
public class Restaurante {

    public String Nombre_Res;
    public String Horario_dias;
    public String Horario_horas;
   
    
    public Restaurante() {
    }

    public Restaurante(String Nombre_Res, String Horario_dias, String Horario_horas) {
        this.Nombre_Res = Nombre_Res;
        this.Horario_dias = Horario_dias;
        this.Horario_horas = Horario_horas;
        
    }

    public String getNombre_Res() {
        return Nombre_Res;
    }

    public String getHorario_dias() {
        return Horario_dias;
    }
    
    public String getHorario_horas() {
        return Horario_horas;
    }

    @Override
    public String toString() {
        return "Restaurante{" + "Nombre_Res=" + Nombre_Res + ", Horario_dias=" + Horario_dias + ", Horario_horas=" + Horario_horas + '}';
    }
    
    

}