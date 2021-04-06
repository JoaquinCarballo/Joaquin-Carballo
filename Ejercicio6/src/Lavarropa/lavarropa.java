
package Lavarropa;


public class lavarropa {
    //Atributos
    String marca;
    String modelo;
    int tipoderopa;
    int kilosdelavado;
    
    //Metodo constructor
    public lavarropa(int tipoderopa){
    this.tipoderopa=tipoderopa;
    }
    //Metodo
    public void tipoderopa(){
        if (tipoderopa==1){
            System.out.println("Programa para lana");
        }
        else if(tipoderopa==2){
            System.out.println("Programa para ropa sucia");
        }
        else if (tipoderopa==3){
            System.out.println("Programa Economico");
        }
        else if(tipoderopa==4){
            System.out.println("Programa para bb");
        }
        else{
            System.out.println("programa invalido");
        }
    }
    
}
