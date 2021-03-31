
package Auto;


public class Auto {
//Atributos
    String marca;
    String modelo;
    int kilometraje;
   
    //Metodo constructor
    public Auto (String marca, String modelo, int kilometraje){
    this.marca=marca;
    this.modelo=modelo;
    this.kilometraje=kilometraje;
    }
    //Metodo
    public void mostrar1 (){
        System.out.println("la marca es "+marca);
        System.out.println("el modelo es "+modelo);
        System.out.println("el kilometraje es "+kilometraje);
                if (kilometraje>0 && kilometraje<10000){
            System.out.println("poco usado");
        }
        else if (kilometraje>=10000 && kilometraje<100000){
            System.out.println("usado");          
             }
        else if (kilometraje>=100000){
            System.out.println("bastante usado");
        }
        else{
            System.out.println("Esta nuevo");
        }
    }

}
