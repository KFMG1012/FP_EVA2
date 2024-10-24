/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_14_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu;
        captu=new Scanner(System.in);
        int numero, residuo;
        String binario="";
        System.out.println("ingresa un numero entero ");
        numero=captu.nextInt();
        if (numero==0){
            System.out.println("el numero en binario es: 0");
                      }
        else{
            while(numero > 0);{
                               residuo=numero%2;
                               binario=residuo+binario;
                               numero=numero/2;
                               
                                 System.out.println("el numero en binario es "+binario);
                              }
             
              
            }
                
                 
                
        
    }
    
}
