

//importo librerias de interfaces
import javax.swing.*;
import java.awt.event.*;

//JFrame es una clase que me permite operar ventanas
public class Formulario extends JFrame implements ActionListener{
    private JButton boton1,boton2,boton3,boton4;
    private JLabel label1;
    
    //Constructor
    public Formulario(){
        setLayout(null);
        
        boton1 = new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
    
        
        boton2 = new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
    
        
        boton3 = new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
        
        boton4 = new JButton("Salir");
        boton4.setBounds(210,200,90,30);
        add(boton4);
        boton4.addActionListener(this);
        
        
        
        label1 = new JLabel("Cliqueá un boton....");
        label1.setBounds(10,10,300,30);
        add(label1);
     
    }
    
    public void actionPerformed(ActionEvent e){
     if (e.getSource() == boton1 ){
       label1.setText("Has Presionado el botón 1");
     }
      if (e.getSource() == boton2 ){
       label1.setText("Has Presionado el botón 2");
     }
       if (e.getSource() == boton3 ){
       label1.setText("Has Presionado el botón 3");
     }
       if (e.getSource()==boton4){
           System.exit(0);
       }
    
    
    }
     
    
    
    public static void main(String args[]){
        //Creo mi objeto
        Formulario FORM = new Formulario();
        FORM.setBounds(0,0,350,300);
        FORM.setVisible(true);
        FORM.setResizable(false);
    
    
    
    
    
    }

    
    
    
    
    
}

