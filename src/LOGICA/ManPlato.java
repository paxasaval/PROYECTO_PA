/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.Pedido;
import Clases.Plato;
import DATA.Imp_Combos;
import DATA.Imp_Pedidos;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ManPlato {
    
    public Plato NuevoPlato(String Nombre_Plato, double Precio, String Detalle, Pedido pedido){
        Plato objPla = new Plato(Nombre_Plato, Precio, Detalle, pedido);
        return objPla;
    }
    
    public Plato RegistrarPlato(String Nombre_Plato, double Precio, String Detalle){
        Plato objPla = new Plato(Nombre_Plato, Precio);
        return objPla;
    }
    
    
    public ArrayList<Plato> AgregarPlato (ArrayList ArrayPlato, String Nombre_Plato, double Precio, String Detalle, Pedido objPed){
        Plato objPla = new Plato(Nombre_Plato, Precio, Detalle, objPed);
        ArrayPlato.add(objPla);
        return ArrayPlato;
    }
    
    public ArrayList<Plato> AñadirPlato (ArrayList ArrayPlato, String Nombre_Plato, double Precio, String Detalle){
        Plato objPla = new Plato(Nombre_Plato, Precio, Detalle);
        ArrayPlato.add(objPla);
        return ArrayPlato;
    }
    
    public Plato ModificarPlato (Plato objPla, String Nombre_Plato, double Precio, String Detalle){
        objPla.setNombre_Plato(Nombre_Plato);
        objPla.setPrecio(Precio);
        objPla.setDetalle(Detalle);
        return objPla;
    }
    
    public ArrayList<Plato> ImportarCombo_Kfc (ArrayList<Plato> ArrayPlato){
        Imp_Combos objImpCom = new Imp_Combos();
        objImpCom.Combos_Kfc(ArrayPlato);   
        return ArrayPlato;
    }
    
    public ArrayList<Plato> ImportarCombo_Fogon (ArrayList<Plato> ArrayPlato){
        Imp_Combos objImpCom = new Imp_Combos();
        objImpCom.Combos_Fogon(ArrayPlato);
        return ArrayPlato;
    }
    
    public ArrayList<Plato> ImportarPedidos (ArrayList<Plato> ArrayPlato){
        Imp_Pedidos objImpPed = new Imp_Pedidos();
        objImpPed.PedidosRealizados(ArrayPlato);
        return ArrayPlato;
    }
    
}
