/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

import java.util.Scanner;
public class rectangulomain {
    public static void main (String [] args){
    Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la base del rectàngulo");
        int base= entrada.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        int altura= entrada.nextInt();
        
        rectangulo valores = new rectangulo(base, altura);
        valores.imprimir();
    }
}
