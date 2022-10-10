/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio.cadenas;

import javax.swing.JOptionPane;

/**
 *
 * @author D9146598
 */
public class Cadenas {

    public static void main(String[] args) {
        comparaAmigas();
    }

    private static void comparaAmigas() {
       
        // recibir cadena uno 
        
        String S = JOptionPane.showInputDialog("ingrese la cadena S: ");
        
        //recibir y guardar cadena dos
        String T = JOptionPane.showInputDialog("ingrese la cadena T: ");


        //saber si las variables son iguales
        if(S.length()!=T.length())
        {
            System.out.printf("las cadenas '%s' y '%s' no son amigas porque no tienen la misma longitud",S,T );
        }

        // System.out.println(S.length());
        for(int i=1;i<S.length();i++){
            String u = S.substring(0,i);
            String v = S.substring(i);

            if(T.equals(v+u)){
                System.out.println("las cadenas son amigas");
            }
            
            
        }
        
        // System.out.printf("cadenas '%s' y '%s'",S,T );

    }
}
