/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.Cliente;
import Clases.Pedido;
import Clases.Usuario;
import DATA.ListarCliente;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class ManCliente {
    
    public Cliente NuevoCliente (int NumTarjeta, int Clave, String Direccion, String mail, int telefono, 
            String Cedula, String PrimApellido, String SegApellido, String PrimNombre, String SegNombre) {
        Cliente objCli = new Cliente(NumTarjeta, Clave, Direccion, mail, telefono, Cedula, PrimApellido, SegApellido, 
                PrimNombre, SegNombre);
        return objCli;
    }
    
    public ArrayList<Cliente> AgregarCliente (ArrayList ArrayCliente, int NumTarjeta, int Clave, String Direccion, String mail, int telefono, 
            String Cedula, String PrimApellido, String SegApellido, String PrimNombre, String SegNombre){
        Cliente objCli = new Cliente(NumTarjeta, Clave, Direccion, mail, telefono, Cedula, PrimApellido, SegApellido, 
                PrimNombre, SegNombre);
        ArrayCliente.add(objCli);
        return ArrayCliente;
    }
    
    public Cliente ModificarCliente(Cliente objCli, int NumTarjeta, int Clave, String Direccion, String mail, int telefono, 
            String Cedula, String PrimApellido, String SegApellido, String PrimNombre, String SegNombre){
        objCli.setNumTarjeta(NumTarjeta);
        objCli.setClave(Clave);
        objCli.setDireccion(Direccion);
        objCli.setMail(mail);
        objCli.setTelefono(telefono);
        objCli.setCedula(Cedula);
        objCli.setPrimApellido(PrimApellido);
        objCli.setSegApellido(SegApellido);
        objCli.setPrimNombre(PrimNombre);
        objCli.setSegNombre(SegNombre);
        return objCli;
    }
    
    public ArrayList<Cliente> ImportarUsuarios(ArrayList<Cliente> ArrayCliente){
        ListarCliente objLisCli = new ListarCliente();
        objLisCli.ImportarUsuarios(ArrayCliente);
        return ArrayCliente;
    }
    
}
