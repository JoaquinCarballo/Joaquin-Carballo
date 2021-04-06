
package Lavarropa;

import java.util.Scanner;
public class lavarropamain {
public static void main (String [] args ){
    Scanner lector=new Scanner(System.in);
    System.out.println("Ingrese el tipo de lavado");
        System.out.println("(1)----Lana");
        System.out.println("(2)----Ropa muy sucia");
        System.out.println("(3)----Economico");
        System.out.println("(4)----Ropa de Bebé");
    int tipodelavado=lector.nextInt();
    
//creo el objeto
    lavarropa objeto1 = new lavarropa(tipodelavado);
    objeto1.tipoderopa();
}   
    
}
