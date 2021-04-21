/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Operaciones.Clasehija_Resta;
import Operaciones.Clasehija_Suma;
public class ClasePrincipal {
    public static void main (String [] args){
        //Creo a mi objeto en el main
        Clasehija_Suma mensajerosuma= new Clasehija_Suma();
        mensajerosuma.PedirDatos();
        mensajerosuma.Sumar();
        System.out.print("El resultado de la suma es ");
        mensajerosuma.MostrarResultado();
        
        Clasehija_Resta mensajeroresta= new Clasehija_Resta();
        mensajeroresta.PedirDatos();
        mensajeroresta.Resta();
        System.out.print("El resultado de la resta es ");
        mensajeroresta.MostrarResultado();
    }
    
}
