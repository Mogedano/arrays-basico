
package domain;

public class Persona {
    //Esta clase solo tiene un atributo
    private String nombre;
    
    //Contructor que inicializa el atributo de nombre
    public Persona(String nombre){
        this.nombre = nombre;
    }    
    
    //Getter y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  

//    @Override
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + '}';
//    }
    
    //Si quisiémos imprimir también la dirección de memoria el método toString()sería así
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}' + ", " + super.toString();
    }
    
    
    
}
