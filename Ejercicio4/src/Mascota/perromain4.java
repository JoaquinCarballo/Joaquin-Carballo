
package Mascota;



import java.util.Scanner;
public class perromain4 {
public static void main (String [] args){
Scanner lector=new Scanner(System.in);
        System.out.println("Ingrese nombre de tu mascota");
        String nombre= lector.next();
perro4 objeto1 = new perro4(nombre);
objeto1.mostrar();
}
    
}
