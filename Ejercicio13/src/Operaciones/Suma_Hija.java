
package Operaciones;


public class Suma_Hija extends OperacionesPadre {
    @Override
    public void Operacion(){
        resultado=valor1+valor2;
    }
    @Override
    public void MostrarResultado(){
    System.out.println(+valor1+" + "+valor2+" es "+resultado);
}
    
}
