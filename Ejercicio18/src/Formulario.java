//Ejercicio 18. Le agregué la opción restar.

import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class Formulario extends JFrame implements ActionListener{
   
    private JTextField valor1,valor2;
    private JLabel Label,Label2,Lresultado;
    private JButton Sumar,Restar;
    
    public Formulario(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Label = new JLabel("Valor 1");
        Label.setBounds(15,10,100,30);
        add(Label);
        
        Label2 = new JLabel("Valor 2");
        Label2.setBounds(15,50,100,30);
        add(Label2);
        
               
        valor1 = new JTextField();
        valor1.setBounds(80,16,100,30);
        add(valor1);
        
        valor2 = new JTextField();
        valor2.setBounds(80,50,100,30);
        add(valor2);
        
        Sumar = new JButton ("Sumar");
        Sumar.setBounds(10,110,100,30);
        add(Sumar);
        Sumar.addActionListener(this);
        
        Restar = new JButton ("Restar");
        Restar.setBounds(120,110,100,30);
        add(Restar);
        Restar.addActionListener(this);
        
        
                     
      
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        int valorUno=0,valorDos=0,resultado=0;
        if (e.getSource() == Sumar){
            valorUno=Integer.parseInt(valor1.getText());
            valorDos=Integer.parseInt(valor2.getText());
            resultado=valorUno+valorDos;
            
            JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
        }
                if (e.getSource() == Restar){
            valorUno=Integer.parseInt(valor1.getText());
            valorDos=Integer.parseInt(valor2.getText());
            resultado=valorUno-(valorDos);
            
            JOptionPane.showMessageDialog(null, "El resultado es "+resultado);
        }
        
        
    
    }
    
    
    
    public static void main(String[] args) {
        Formulario Form  = new Formulario();
        Form.setBounds(0,0,300,200);
        Form.setVisible(true);
         
    
    }
    
    
    
    
    
    
    
    
}
