
package Polimorfismo;

//Hereda los atributos de la clase Padre
public class Celular_Hija extends BateriaPadre {
   
    @Override
    public void Seleccion(){
        if (opcion==1){
            System.out.println("Oprima (1) para consultar el Nokia");
            System.out.println("Oprima (2) para consultar el Motorolla");
            opcionCel=entrada.nextInt();
            if(opcionCel==1){
                duracion=5;
            } else{
                duracion=9;
            }
        }

        
        
    }
    
}
