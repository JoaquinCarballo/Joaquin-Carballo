
package Lavarropas;


public class Programas {
//Atributos privados->por qué los hago privados?
    private int kilos = 0,tipoderopa  =0,llenadocompleto = 1,lavadocompleto = 0,secadocompleto = 0;
    public Programas(int prog, int peso){
        this.tipoderopa=prog;
        this.kilos=peso;
    }
    private void llenado(){
    llenadocompleto=0;
if(kilos<=12){
    llenadocompleto=1;
    System.out.println("Llenado completo");
} else{
    System.out.println("La carga supera el peso máximo permitido");
}   
    }


    private void lavado(){
    llenado();
if (llenadocompleto==1){
switch (tipoderopa)
{
case 1:
System.out.println("Lavado Suave la lana.");

lavadocompleto=1;
break;
case 2:
System.out.println("Lavado ropa sucia");

lavadocompleto=1;
break;
case 3:
System.out.println("Lavado económico.");

lavadocompleto=1;
break;
case 4:
System.out.println("Lavado ropa de Bebe");

lavadocompleto=1;
break;
default:
System.out.println("No existe el programa seleccionado");

        
}

}else {
System.out.println("No es posible iniciar el lavado");
}      
}
private void secado(){
lavado();
if (lavadocompleto==1){
System.out.println("Secando...");
secadocompleto=1;
}else{
System.out.println("No es posible iniciar el secado");
}
}
public void Display(){
secado();
if (secadocompleto==1){
System.out.println("Tu ropa está lista");
}
}    
}
