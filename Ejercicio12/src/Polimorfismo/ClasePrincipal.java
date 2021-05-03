
package Polimorfismo;
import Polimorfismo.BateriaPadre;
import java.util.Scanner;
//Como hago para que no se me ejecute dos veces? Si entro con opcion 2 me tira duracion 0
public abstract class ClasePrincipal extends BateriaPadre   {
   
      

public static void main (String [] args){
    int opcionuser;
    Scanner entrada= new Scanner(System.in);
    System.out.println("--Tipo de dispositivo--");
    System.out.println("--(1) Telefono --------");
    System.out.println("--(2) Tablet ----------");
    opcionuser= entrada.nextInt();
    
     
    
    
    
    
    
    if(opcionuser==1){
         
    BateriaPadre mensajeroCel= new Celular_Hija ();
    mensajeroCel.PedirDatos(3);
    mensajeroCel.Seleccion();
    mensajeroCel.MostrarResultado();
    
    }else if(opcionuser==2){
    BateriaPadre mensajeroTab = new Tablet_Hija();
    mensajeroTab.PedirDatos(2);
    mensajeroTab.Seleccion();
    mensajeroTab.MostrarResultado();
        
    }else{
       System.out.println("Opcion incorrecta"); 
    }
    
     //creo objeto_>>>>>>>>>>>>>>>>>>>>>>>>>>>>Instanciado en clase hija para que llame bien a operaciones y me haga la suma
            
    

    
    
    
    
   

    

    

}
}