/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author pablo
 */
public class cuentabancaria {
  String nombretitular;
  String tipodecuenta;
  int saldo;
  
  public void extraer(){
    if (saldo>0){
        System.out.println("¿Quiere extraer dinero?");
    }
    else{
        System.out.println("No dispone de fondos");
    }
}
}
