/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.Plato;
import Clases.Restaurante;
import DATA.Crear_Lista;
import DATA.PreListar;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ManRestaurante {
    
    public Restaurante NuevoRestaurante(String Nombre_Res, String Horario_dias, String Horario_horas){
        Restaurante objRes = new Restaurante(Nombre_Res, Horario_dias, Horario_horas);
        return objRes;
    }
    
    public ArrayList<Restaurante> AgregarRestaurante(ArrayList ArrayRestaurante, String Nombre_Res, String Horario_dias, String Horario_horas){
        Restaurante objRes = new Restaurante(Nombre_Res, Horario_dias, Horario_horas);
        ArrayRestaurante.add(objRes);
        return ArrayRestaurante;
    }
    
    public ArrayList<Restaurante> ImportarPreVisualizacion(ArrayList<Restaurante> ArrayRestaurante){
        PreListar objPreLis = new PreListar();
        objPreLis.ImportarPreVisualizacion(ArrayRestaurante);
        return ArrayRestaurante;
    }
    
    public String[] listarRestaurantes(){
        ArrayList<Restaurante> ArrayRestaurante = new ArrayList<Restaurante>();
        String[] cabecera = new String[ArrayRestaurante.size()];
        ArrayList<String> list = new ArrayList<String>();
        PreListar objPreLis = new PreListar();
        objPreLis.ImportarPreVisualizacion(ArrayRestaurante);
        for(Restaurante res:ArrayRestaurante){
            list.add(res.Nombre_Res);
        }
        list.toArray(cabecera);
        return cabecera;
    }
    
}
