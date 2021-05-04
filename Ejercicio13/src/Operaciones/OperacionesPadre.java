
package Operaciones;

import java.util.Scanner;

public abstract class OperacionesPadre {
    protected int valor1,valor2,resultado;
    protected int opcion;
    Scanner entrada= new Scanner(System.in);
    
    public void PedirValores(){
        System.out.println("Ingrese primer valor");
        valor1=entrada.nextInt();
        System.out.println("Ingrese segundo valor");
        valor2=entrada.nextInt();
    }
    
public abstract void Operacion();

public abstract void MostrarResultado();
    

    
}
