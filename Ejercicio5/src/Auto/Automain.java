
package Auto;

import java.util.Scanner;
public class Automain {
    public static void main (String [] args){
    Scanner lector=new Scanner(System.in);
        System.out.println("ingrese la marca de tu auto ");
        String marca= lector.next();
        System.out.println("ingrese el modelo de tu auto ");
        String modelo= lector.next();
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese kilometraje ");
        int kilometraje=entrada.nextInt();
        //creo objeto
        Auto objeto=new Auto(marca,modelo,kilometraje);
        objeto.mostrar1();
        
    }
    
}
