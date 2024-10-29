/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String menu[]={"enchiladas","burritos","tortas","tamales","huevos","moristqueta","cueritos"};
       int precios[]={20,35,26,80,98,52,30};
       Scanner captu;
       captu=new Scanner(System.in);
       int cantidad,producto;
       for(int i=0; i< menu.length; i++)
       {
           System.out.println(i+"-"+menu[i]+"$"+precios[i]);
       }
       System.out.println("¿Cual es la orden?(introduce el numero del producto que deseas)");
       producto=captu.nextInt();
        System.out.println("¿Cuantas ordenes vas a querer?");
        cantidad=captu.nextInt();
         System.out.println("el costo total es de $"+cantidad*precios[producto]);
    }
    
}
