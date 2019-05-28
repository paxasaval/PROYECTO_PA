/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.Plato;
import DATA.Imp_Combos;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ManPlato {
    
    public Plato NuevoPlato(String Nombre_Plato, String Precio, String Detalle){
        Plato objPla = new Plato(Nombre_Plato, Precio, Detalle);
        return objPla;
    }
    
    public ArrayList<Plato> AgregarPlato (ArrayList ArrayPlato, String Nombre_Plato, String Precio, String Detalle){
        Plato objPla = new Plato(Nombre_Plato, Precio, Detalle);
        ArrayPlato.add(objPla);
        return ArrayPlato;
    }
    
    public Plato ModificarPlato (Plato objPla, String Nombre_Plato, String Precio, String Detalle){
        objPla.setNombre_Plato(Nombre_Plato);
        objPla.setPrecio(Precio);
        objPla.setDetalle(Detalle);
        return objPla;
    }
    
    public ArrayList<Plato> ImportarCombo (ArrayList<Plato> ArrayPlato){
        Imp_Combos objImpCom = new Imp_Combos();
        objImpCom.Combos_Kfc(ArrayPlato);
        return ArrayPlato;
    }
    
}
