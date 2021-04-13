
package Banco;


public class Cuentabancaria {
  private String nombretitular;
  private String tipodecuenta;
  private int dinerosolicitado;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getDinerosolicitado(int dinerosolicitado) {
        return dinerosolicitado;
    }

    public void setDinerosolicitado(int dinerosolicitado) {
        this.dinerosolicitado = dinerosolicitado;
    }
 private int saldo=5000;
   
  //metodo
  public void extraer(){
    if (dinerosolicitado < saldo){
        System.out.println("Extrayendo....");
        System.out.println("Extracción exitosa");
    }
    else{
        System.out.println("No dispone de fondos");
    }
  }
}


    


