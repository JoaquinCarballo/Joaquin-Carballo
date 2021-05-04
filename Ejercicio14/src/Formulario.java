import javax.swing.*;
//Formulario hereda atributos y metodos de JFrame
public class Formulario extends JFrame {
    
    //Creo mi constructor
    public Formulario(){
        setLayout(null);
    }
    
    // porque creo el constructor fuera del main?
    public static void main (String [] args){
        //Creo el objeto
        Formulario Form= new Formulario();
        Form.setBounds(0,0,400,550);
        Form.setVisible(true);
        Form.setLocationRelativeTo(null);
        
    }
    
}
