
package Mascota;

public class perromain {
public static void main (String [] args){
    perro perro1 =new perro();
    perro1.ladrar();

    perro1.setNombre("Simon");
    perro1.setRaza("Callejero");
    perro1.setEdad(6);
    System.out.println("Mi nombres es "+perro1.getNombre());
    System.out.println("Mi raza es "+perro1.getRaza());
    System.out.println("Mi edad es "+perro1.getEdad());
    perro1.ladrar();
}
    
}

