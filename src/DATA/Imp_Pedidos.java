/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Clases.Pedido;
import Clases.Plato;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Jorge
 */
public class Imp_Pedidos {
    
    public ArrayList<Plato> PedidosRealizados(ArrayList<Plato> ArrayPedidos) {
        Pedido pedido = new Pedido();
        File f = new File("data/Plaatos1.txt");
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
                    Plato objTmpPla = new Plato(st.nextToken(), Integer.valueOf(st.nextToken()), st.nextToken(), pedido);
                    ArrayPedidos.add(objTmpPla);
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
        return ArrayPedidos;
    }
    
}
