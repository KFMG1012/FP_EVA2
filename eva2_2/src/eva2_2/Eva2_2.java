/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acum;
        acum=0;
        for(int i=1; i <=20; i++){  Scanner captu;
      int califa;
      captu=new Scanner(System.in);
         System.out.println("estudiante"+i);
      System.out.println("dame la califa");
      califa=captu.nextInt();
        acum=acum + califa;}
        System.out.println("total "+ acum);
        
     {  System.out.println("dame el promedio "+(acum/20));}
     
    
    }
    
}
