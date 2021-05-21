//Ejercicio17
import javax.swing.*;
import java.awt.event.*;

//hago herancia de la clase JFRAME
public class Formulario extends JFrame implements ActionListener  {
    
    //creo 3 componenetes 
    private JTextField Textbox;
    private JLabel Label;
    private JButton boton;
    
    // creo constructor
    public Formulario (){
        setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
      //Instancio mi objeto
      Label= new JLabel ("¡Bienvenido!");
      Label.setBounds(15,10,200,30);
      add(Label);
      
      //Instancio mi objeto
      Textbox= new JTextField();
      Textbox.setBounds(15,50,250,30);
      add(Textbox);
      
      //instancio mi objeto
      boton=new JButton ("Saludar");
      boton.setBounds(15,90,100,30);
      add(boton);
      boton.addActionListener(this);
      
    }
    //Polimorfismo porque estoy modificando uno de los métodos
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton){
            String texto="Hola "+Textbox.getText();
            JOptionPane.showMessageDialog(null,texto);
        }
    }
            
    
    public static void main(String[] args){
        //Creo mi objeto
        Formulario Form= new Formulario();
        Form.setBounds(0,0,400,200);
        Form.setVisible(true);
    }
    
}
