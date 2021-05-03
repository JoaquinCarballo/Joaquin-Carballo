
package Polimorfismo;

import java.util.Scanner;
//abstraigo una clase->está atenta al llamado de sus clases hijas para saber como actuar con los metodos
public  abstract class BateriaPadre {
    protected String marca,nombre;
    protected int opcion,opcionCel,opcionTab,duracion;
    //creo el objeto de Scanner
    Scanner entrada= new Scanner(System.in);
    
   

    
    
    //Metodo contructor
    public int PedirDatos(int opcionuser){
        /*System.out.println("---Bienvenidos al catalogo---");
        System.out.println("Oprima (1) para consultar celulares");
        System.out.println("Oprima (2) para consultar tablets");
        opcion= entrada.nextInt();*/
        opcion=opcionuser;
        return 0;
        
    }
    // este metodo va a estar llamado en celulares y tablets y va actuar según quién lo llame
    public abstract void Seleccion ();
    
    //Metodo
    public void MostrarResultado(){
        System.out.println("La duracion de la bateria es "+duracion);
    }
}
