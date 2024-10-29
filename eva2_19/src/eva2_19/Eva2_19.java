/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu[];
       int precios[];
       Scanner captu;
       captu=new Scanner(System.in);
       int cantidad;
         System.out.println("¿Cuantas productos vas a tener en el menu");
        cantidad=captu.nextInt();
        menu=new String[cantidad];
        precios=new int [cantidad];
        
        for(int i=0; i<menu.length; i++)
        {
            System.out.println("nombre del producto");
            menu[i]=captu.nextLine();
            System.out.println("precio");
            precios[i]=captu.nextInt();
            
        }
        for(int i=0; i<menu.length; i++)
        {
            System.out.println(i+"-"+menu[i]+"$"+precios[i]);
        }
        
    }
    
}
