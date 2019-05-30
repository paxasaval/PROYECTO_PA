/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Clases.Plato;
import Clases.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class Imp_Usuarios {
    private static Scanner sc;
    Usuario objUsu = new Usuario();
    private static String user, pass;
//    public ArrayList<Usuario> ImportarUsuarios(ArrayList<Usuario> ArrayUsuario) {
//        Validacion objVal = new Validacion();
//        int i =0;
//        File f = new File("data/Usuarios1.txt");
//        StringTokenizer st;
//        Scanner entrada = null;
//        String sCadena;
//        String usuario [] = null;
//        try {
//            entrada = new Scanner(f);
//            while (entrada.hasNext()) {
//                sCadena = entrada.nextLine();
//                st = new StringTokenizer(sCadena, ",");
//                while (st.hasMoreTokens()) {
//                    Restaurante objTmpCli = new Restaurante(st.nextToken(),st.nextToken(), st.nextToken());
//                    Usuario objTmpUsu = new Usuario(st.nextToken(), Integer.toString(Integer.valueOf(st.nextToken())));
//                    ArrayUsuario.add(objTmpUsu);
//                    objVal.ValidarUsuario(usuario, st.nextToken(), Integer.toString(Integer.valueOf(st.nextToken())));
//                    usuario[i++] = st.hasMoreTokens;
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                if (null != entrada) {
//                    entrada.close();
//                }
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//        return ArrayUsuario;
//    }
    public void LeerUsers (String [] usuarios, String user, String pass){
        FileReader fr=null;
        try {
            int nLineas=0;
            int i = 0;
//            String [] usuarios = null;
            String linea;
//            sc = new Scanner (new File("data/Usuarios2.txt"));
            File f = new File("data/Usuarios2.txt");
            
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                while((linea=br.readLine())==null){
                    nLineas++;
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(Imp_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            usuarios = new String [nLineas];
            
//            while(sc.hasNextLine()){
//                usuarios[i++] = sc.nextLine();
//            }
            
            Usuario objTmpUsu = new Usuario(objUsu.getCedula(), objUsu.getClaveAcceso());
            Validacion val = new Validacion();
            val.ValidarUsuario(usuarios, user, pass);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Imp_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Imp_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
