/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica8;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_practica8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu;
        captu=new Scanner (System.in);
        String usu;
        String psword;
        System.out.println("PROGRAMA PRINCIPAL!!");
        do{
        System.out.println("dame el usu");
        usu=captu.nextLine();
        System.out.println("dame la contraseña");
        psword=captu.nextLine();
        }while(!(usu.equals("admin") && psword.equals("1234")));
    }

}
