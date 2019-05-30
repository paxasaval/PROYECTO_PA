/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Clases.Plato;
import Clases.Restaurante;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jorge
 */
public class ListarRestaurantes {
    
    public void escribirRestaurantes(Restaurante restaurante) throws IOException{
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
    
        archivo = new File("data/Restaurantes.txt");
        
        if(!archivo.exists()){
            try{
//            archivo.createNewFile();
            escribir =new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(restaurante);
            linea.close();
            escribir.close();
            }catch(FileNotFoundException ex){
                System.out.println("error1"+ex);
            }
        }else{
              try{
            
            escribir =new FileWriter(archivo,true);
            linea=new PrintWriter(escribir);
            linea.println(","+restaurante.Nombre_Res+","+restaurante.Horario_dias+","+restaurante.Horario_horas);
             linea.close();
            escribir.close();
            }catch(FileNotFoundException ex){
               System.out.println("error2"+ex);
            }
        }
    }
    
}
