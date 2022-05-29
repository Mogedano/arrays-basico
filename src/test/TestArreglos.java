package test;

public class TestArreglos {
    public static void main(String[] args) {
        //Arreglo de tipos entero
        //A la izquierda del = se está declarando una variable de tipo arreglo y a la derecha se está instanciando 
        //un objeto de tipo arreglo, usamos new ya que los arreglos son un tipo object 
        int edades[] = new int[3];    
        //Imprimimos la dirección de memoria del objeto arreglo
        System.out.println("edades = " + edades);
        
        //Modificamos los elementos del arreglo
        edades[0] = 10;
        //Imprimimos el valor de un índice concreto
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 15;
        edades[2] = 20;
        edades[0] = 5;
        
        System.out.println("edad 0 = " + edades[0] +
                           "; edad 1 = " + edades[1] +
                           "; edad 2 = " + edades[2]);   
        
        
        //Iteración de todos los elementos utilizando un ciclo for
        for (int i = 0; i < edades.length ; i++){            
            System.out.println("edades elemento " + i + ": " + edades[i]);            
        } 
        
        //Podemos inicializar los valores desde la misma creación del arreglo, se llama sintaxis resumida
        String frutas[] = {"Naranja", "Platano", "Uva"}; 
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta = " + i + ": " + frutas[i]);
        }
        
        int longitudes[]={1,10,100};
        for(int i = 0; i < longitudes.length; i++){
            System.out.println("longitudes = " + i + ", " + longitudes[i]);
        }       
        
    }
    
}
