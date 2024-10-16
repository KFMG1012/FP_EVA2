/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica9;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class EVA2_Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("PROGRAMA PRINCIPAL!!");
        String usu="";
        String psword="";

        Scanner captu=new Scanner (System.in);
        
        while(!(usu.equals("admin") && psword.equals("1234")));{
        System.out.println("dame el usu");
        usu=captu.nextLine();
        System.out.println("dame la contraseña");
        psword=captu.nextLine();
        
        
    }
    }
    
}
