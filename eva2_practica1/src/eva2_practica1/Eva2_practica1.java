/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica1;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String cadena;
        Scanner captu;
       captu=new Scanner (System.in);
       System.out.println("dame la cadena");
       cadena=captu.nextLine();
       System.out.println("dame el numero de veces que quieres repetir");
       numero=captu.nextInt();
       for(int i=1; i<=numero; i++){System.out.println(cadena);}
    }
    
}
