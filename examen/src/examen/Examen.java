/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author 52452
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int juegos;
        int final1;
int nm;
      int player;
    System.out.println("BIENVENIDO AL JUEGO PIEDRA,PAPEL,TIJERA");
    System.out.println("puedes elejir un numero del 1 al 3, el 1piedra,2papel,3tijera");
    Scanner captu=new Scanner(System.in);
    System.out.println("dame un numero");
    player=captu.nextInt();
   
  
    switch(player)
            {
        case 1:
            System.out.println("piedra");
            break;
            case 2:
            System.out.println("papel");
            break;
            case 3:
            System.out.println("tijera");
            break;
            case 4:
                System.out.println("no es el numero");
                       }
    
    Random computadora=new Random();
   int aleatorio;
        aleatorio=computadora.nextInt(1,3);
        System.out.println(aleatorio);
     nm=aleatorio;
    switch(nm)
            {
        case 1:
            System.out.println("piedra");
            break;
            case 2:
            System.out.println("papel");
            break;
            case 3:
            System.out.println("tijera");
            default:
                System.out.println("no es el numero");
            }
    
    
    
    
    
    }
    
}
