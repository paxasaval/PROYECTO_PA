/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Clases.Cliente;
import Clases.Pedido;
import Clases.Plato;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jorge
 */
public class ListarPedidos {
    
    public void escribirPedidos(Plato plato) throws IOException{
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
    
        archivo = new File("data/Platos1.txt");
        
        if(!archivo.exists()){
            try{
//            archivo.createNewFile();
            escribir =new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(plato);
            linea.close();
            escribir.close();
            }catch(FileNotFoundException ex){
                System.out.println("error1"+ex);
            }
        }else{
              try{
            
            escribir =new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(","+plato.Nombre_Plato+","+plato.Precio+","+plato.Detalle+","+plato.pedido.NumMesa+","+plato.pedido.Tiempo_Espera+","
            +plato.pedido.NumOrden+","+plato.pedido.estado+",");
             linea.close();
            escribir.close();
            }catch(FileNotFoundException ex){
               System.out.println("error2"+ex);
            }
        }
    }
    
    
}
