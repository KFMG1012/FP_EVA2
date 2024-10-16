/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica6;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero;
       String cade="";
       Scanner captu;
       captu=new Scanner(System.in);
       System.out.println("dame el numero");
       numero=captu.nextInt();
       for(int i=1; i<=numero; i++)              {
           cade=cade+"*"; System.out.println(cade);
      } for(int i=numero; i>=1; i--)                   {
          cade="";
          for(int j=1; j<=i; j++){cade=cade+"*"; }System.out.println(cade);
                                                       }
       
    }
    
}
