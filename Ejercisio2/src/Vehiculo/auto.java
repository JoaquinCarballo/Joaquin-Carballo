/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author pablo
 */
public class auto {
    String marca;
    String modelo;
    int kilometraje;
    
    public void estadoauto(){
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