/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_4_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner captu;
        captu=new Scanner (System.in);
          System.out.println("ingrese el numero");
        numero=captu.nextInt();
        int acum=1;
        for(int i=numero; i>=1; i--){
            acum=acum*i;
            System.out.println("la factorial es= "+ acum);
            
                                    }
    }
    
}
