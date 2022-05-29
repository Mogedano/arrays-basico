package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        //Arreglo de tipo Object, es un arreglo de objetos de tipo Persona

        Persona personas[] = new Persona[2];
        //Cada uno de los índices apuntará a un objeto de tipo Persona. Modificamos los valores de los elementos
        //Creamos un nuevo objeto de tipo Persona y lo asignamos al íncide 0 del arreglo
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        //Si no tuviésemos el método toString() en la clase Persona imprimiríamos la posición en memoria de los objetos. 
        //El método toString() en la clase Persona nos permite ver una representación
        //de los valores de cada uno de los atributos de nuestro objeto
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);

        //Iterar los elementos de un arreglo de tipo Object
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas = " + i + ": " + personas[i]);

        }

    }
}
