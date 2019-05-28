/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Clases.Restaurante;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Jorge
 */
public class PreListar {

    public static ArrayList<Restaurante> ImportarPreVisualizacion(ArrayList<Restaurante> ArrayRestaurante) {
//        ArrayList<Restaurante> ArrayRestaurante = new ArrayList<Restaurante>();
//        File f = new File("C:/Users/Jorge/Documents/NetBeansProjects/PROYECTO/Lista_Restaurante.txt");        
        File f = new File("data/Restaurantes.txt");
        StringTokenizer st;
        Scanner entrada = null;
        String sCadena;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNext()) {
                sCadena = entrada.nextLine();
                st = new StringTokenizer(sCadena, ",");
                while (st.hasMoreTokens()) {
//                    Restaurante objTmpCli = new Restaurante(st.nextToken(),st.nextToken(), st.nextToken());
                    Restaurante objTmpCli = new Restaurante(st.nextToken(), st.nextToken(), st.nextToken());
                    ArrayRestaurante.add(objTmpCli);
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
        return ArrayRestaurante;
    }

}
