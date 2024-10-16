/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practiva3;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_practiva3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena;
       Scanner captu;
       captu=new Scanner (System.in);
       System.out.println("dame la cadena de texto");
       cadena=captu.nextLine();
       for(int i=0; i<cadena.length(); i++){
       System.out.println(cadena.charAt(i));}
    }
    
}
