/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Clases.Cliente;
import Clases.Restaurante;
import Clases.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.annotation.processing.FilerException;

/**
 *
 * @author Jorge
 */
public class ListarCliente {
    
    public static ArrayList<Cliente> ImportarUsuarios(ArrayList<Cliente> ArrayCliente){   
//        ArrayList<Restaurante> ArrayRestaurante = new ArrayList<Restaurante>();
//        File f = new File("C:/Users/Jorge/Documents/NetBeansProjects/PROYECTO/Lista_Restaurante.txt");        
        File f = new File("data/Usuarios_Factura.txt");        
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {            
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()){
//                    Restaurante objTmpCli = new Restaurante(st.nextToken(),st.nextToken(), st.nextToken());
                    Cliente objTmpCli = new Cliente(st.nextToken(),st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
                    ArrayCliente.add(objTmpCli);
                }
            }                      
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (null != entrada) {
                    entrada.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return ArrayCliente;
    }
    public void escribirCliente(Cliente cliente) throws IOException{
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
    
        archivo = new File("data/Clientes.txt");
        
        if(!archivo.exists()){
            try{
//            archivo.createNewFile();
            escribir =new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(cliente);
            linea.close();
            escribir.close();
            }catch(FileNotFoundException ex){
                System.out.println("error1"+ex);
            }
        }else{
              try{
            
            escribir =new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(cliente.PrimNombre+";"+cliente.SegNombre+";"+cliente.PrimApellido+";"+cliente.SegApellido+";"
            +String.valueOf(cliente.NumTarjeta)+";"+String.valueOf(cliente.Clave)+";"+cliente.Direccion+";"+cliente.mail+";"+String.valueOf(cliente.telefono)+";"+cliente.Cedula);
             linea.close();
            escribir.close();
            }catch(FileNotFoundException ex){
               System.out.println("error2"+ex);
            }
        }
        
    
    
}
    }
