
import javax.swing.*;
public class Formulario extends JFrame {
    private JLabel label1;
    
    public Formulario (){
        //invoco al set Layout
        setLayout(null);
        label1=new JLabel("Etiqueta CFP036");
        label1.setBound(10,20,200,300);
        add(label1);
    }
    public static void main (String args []){
        Formulario ford= new Formulario ();
        ford.setBounds(0,0,400,300);
        ford.setVisible(true);
        ford.setLocationRelativeTo(null);
    }

    private static class JLabel {

        public JLabel() {
        }
    }
}
