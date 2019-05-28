/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Clases.Restaurante;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Crear_Lista {

    public static void ImportarDatos () {
        Scanner teclado = new Scanner(System.in);
        String Restaurante = "", horario_dias = "", horario_horas = "";
        try {
            Formatter File_Res = new Formatter("Lista_Restaurante.txt");
//            File_Res.format("%s;%s;%s", "NOMBRE RESTAURANTE", "DIAS DE ATENCION", "HORARIO DE ATENCION");
//            File_Res.format("\r\n");

            for (int i = 0; i < 3; i++) {
                System.out.print("\nNOMBRE DEL RESTAURANTE: ");
                Restaurante = teclado.next();
                System.out.print("\nDIAS DE ATENCION: ");
                horario_dias = teclado.next();
                System.out.print("\nHORA DE ATENCION: ");
                horario_horas = teclado.next();
                File_Res.format("%s;%s;%s", Restaurante, horario_dias, horario_horas);
                File_Res.format("\r\n");
            }
            File_Res.close();
        } catch (Exception e) {
        }

    }
}
