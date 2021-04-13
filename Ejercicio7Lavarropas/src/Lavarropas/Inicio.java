
package Lavarropas;

import java.util.Scanner;
public class Inicio {
public static void main(String[] args){
       Scanner programa = new Scanner(System.in);
   
        System.out.println("------Seleccione el Programa ----");
        System.out.println("--(1) LANA                   ----");
        System.out.println("--(2) ROPA MUY SUCIA         ----");
        System.out.println("--(3) ECONOMICO              ----");
        System.out.println("--(4) ROPA DE BEBE           ----");
        System.out.println("---------------------------------");      
        int prog = programa.nextInt();
        System.out.print("Indique el peso aproximado de la ropa (En enteros):");
        int peso = programa.nextInt();
        
        //constructor
        Programas mensajero= new Programas(prog,peso);
        //Este objeto para qué es?
        Lavarropas mensajero2= new Lavarropas();
        mensajero.Display();
        mensajero2.especificaciones();
}        
    
}
