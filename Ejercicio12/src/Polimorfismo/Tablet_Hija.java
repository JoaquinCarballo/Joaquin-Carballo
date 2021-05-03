
package Polimorfismo;


public class Tablet_Hija extends BateriaPadre {
    @Override
    public void Seleccion(){
                if (opcion==2){
            System.out.println("Oprima (1) para consultar Tablet LG");
            System.out.println("Oprima (2) para consultar Tablet Ipad ");
            opcionTab=entrada.nextInt();
            if(opcionTab==1){
                duracion=10;
            } else{
                duracion=18;
            }
        }
        
    }
    
}
