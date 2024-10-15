/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base1,expo;
        Scanner captu;
        captu=new Scanner(System.in);
        System.out.println("dame la base");
        base1=captu.nextInt();
        captu.nextLine();
         System.out.println("dame el exponente");
        expo=captu.nextInt();
        captu.nextLine();
        int acum=1;
        for(int i=1; i<= expo; i++){ acum=acum*base1; 
       } System.out.println("dame el exponente= "+ acum );
    }
    
}
