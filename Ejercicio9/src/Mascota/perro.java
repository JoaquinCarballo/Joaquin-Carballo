
package Mascota;


public class perro {
    private String nombre;
    private String raza;
    private int edad;
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setRaza (String raza){
        this.raza=raza;
    }
    public String getRaza(){
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void ladrar(){
        System.out.println("GUAU!");
    }
            
    
}
