
package Banco;
import java.util.Scanner;
//Crear la clase cuentaBancaria que tenga como atributo nombreTitular, tipoDeCuenta y saldo. 
//Elegir el tipo de dato adecuado para cada uno de ellos. Además hacer el método extraer() que permita extraer dinero, si se puede. 
//Crear un objeto de esta clase y comprobar el funcionamiento
//Encapsular la clase del ejercicio 3 y realizar los métodos getter y setter necesarios.
public class Cuentabancariamain {
    public static void main (String [] args){
       
    Scanner ingresar = new Scanner (System.in);
    System.out.println("====== ¡BIENVENIDO! ======");
    
    Cuentabancaria cliente1= new Cuentabancaria();
    System.out.println("Su saldo es " +cliente1.getSaldo());
    System.out.println("Ingrese dinero solicitado: ");
    
    int dinerosolicitado=ingresar.nextInt();
    cliente1.setDinerosolicitado(dinerosolicitado);
    cliente1.extraer();
    
    
    }
    
    }  

