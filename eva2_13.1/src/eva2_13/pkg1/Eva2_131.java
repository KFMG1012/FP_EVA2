/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13.pkg1;

import java.util.Scanner;

/**
 *
 * @author 52452
 */
public class Eva2_131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cade;
        int vocales=0;
        Scanner captu; captu=new Scanner(System.in);
        System.out.println("ingresa una cadena de texto");
        cade=captu.nextLine();
        for(int i=0; i<cade.length(); i++) { if(cade.charAt(i)=='a'
                ||cade.charAt(i)=='e'||cade.charAt(i)=='i'||cade.charAt(i)=='o'||cade.charAt(i)=='u'){vocales++;} }
        System.out.println("su palabra tiene "+vocales);
    }
    
}
