package ejercicio3_EasyStack;

// Pila
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

//Creacion de la clase pila.
 
public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    //Agrega un número al tope.
     
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    
     //Elimina el elemento del tope.
     
    public void pop() {
        if (tope != null) {
            tope = tope.siguiente;
        }
    }

    //Devuelve el elemento del tope.
     
    public String top() {
        if (tope == null) {
            return "Empty!";
        }

        return String.valueOf(tope.dato);
    }
}