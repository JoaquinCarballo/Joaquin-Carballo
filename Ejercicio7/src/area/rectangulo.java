
package area;


public class rectangulo {
    //Atributos
 private int base, altura, area;
 
 public rectangulo(int base, int altura){
     this.base=base;
     this.altura=altura;
 }
 public void calculoarea(){
     area=base*altura;
 }
 public void imprimir (){
     calculoarea();
     System.out.println("El area es "+area);
 }
}
