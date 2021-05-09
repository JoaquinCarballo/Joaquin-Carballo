
import javax.swing.*;
import java.awt.event.*;
public class Formulario15 extends JFrame {
    private JLabel etiqueta;
    
    //constructor
public Formulario15(){
    setLayout(null);
    //Cuando cierro el programa deja de correr
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    etiqueta= new JLabel ("¡Ejercicio 15 resuelto!");
    //X,Y poistion; ancho y alto
    etiqueta.setBounds(70,10,200,100);
    add(etiqueta);
}
public static void main (String args []){
    //Creo mi objeto
    Formulario15 form= new Formulario15();
    //aca en ancho y alto defino como me printea el formulario
    form.setBounds(0,0,300,150);
    form.setVisible(true);
    
}
    
}
