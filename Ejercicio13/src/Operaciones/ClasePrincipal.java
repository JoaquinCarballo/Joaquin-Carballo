
package Operaciones;

import Operaciones.OperacionesPadre;
import java.util.Scanner;
public  abstract class ClasePrincipal extends OperacionesPadre {
    
public static void main (String[] args){
int opcionuser;

OperacionesPadre mensajeroSumar= new Suma_Hija();
OperacionesPadre mensajeroRestar= new Resta_Hija();
Scanner entrada= new Scanner(System.in);
System.out.println("--Bienvenidos a la calculadora--");
System.out.println("Oprima (1) para Sumar y (2) para Restar");
opcionuser=entrada.nextInt();

if(opcionuser==1){
    mensajeroSumar.PedirValores();
    mensajeroSumar.Operacion();
    mensajeroSumar.MostrarResultado();
    
} else if (opcionuser==2){
    mensajeroRestar.PedirValores();
    mensajeroRestar.Operacion();
    mensajeroRestar.MostrarResultado();
}else{
    System.out.println("Ingreso Incorrecto");
}
   
}    

    
}
