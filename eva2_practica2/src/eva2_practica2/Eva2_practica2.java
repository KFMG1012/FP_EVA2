/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica2;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nm,nm2,nm3,nm4;
        Scanner captu;
        captu=new Scanner (System.in);
        System.out.println("Ingresa el numero que deseas ver de forma ascendente");
        nm=captu.nextInt();
        nm3=nm;
         System.out.println("Ingresa el numero en el que deseas que termine");
           nm2=captu.nextInt();
           nm4=nm2;
        for(int i=nm; i<=nm2; i++ ){System.out.println(i); }
        
        for(int i=nm4; i>=nm3; i--){System.out.println(i);}
      
    }
    
}
