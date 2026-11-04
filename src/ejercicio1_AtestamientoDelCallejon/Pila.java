package ejercicio1_AtestamientoDelCallejon;

// Pila
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026


//Pila de placas de automóviles (el último automóvil que entra es el primero que sale)
 
public class Pila {
    private Nodo tope;

    //Inicializa una pila vacía.
     
    public Pila() {
        tope = null;
    }

    //Agrega una placa al tope de la pila.
     
    public void push(String placa) {
        Nodo nuevo = new Nodo(placa);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    //Elimina y devuelve la placa del tope.
     
    public String pop() {
        if (tope == null) {
            return null;
        }

        String placa = tope.placa;
        tope = tope.siguiente;
        return placa;
    }

    
     //Indica si la pila está vacía.
     
    public boolean estaVacia() {
        return tope == null;
    }
}