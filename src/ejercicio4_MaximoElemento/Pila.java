package ejercicio4_MaximoElemento;

// Pila
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

//Pila que permite consultar el elemento máximo.

public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    //Agrega un número y actualiza el máximo.
     
    public void push(int dato) {
        int maximo;

        if (tope == null || dato > tope.maximo) {
            maximo = dato;
        } else {
            maximo = tope.maximo;
        }

        Nodo nuevo = new Nodo(dato, maximo);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    //Elimina el elemento del tope.
     
    public void pop() {
        if (tope != null) {
            tope = tope.siguiente;
        }
    }

    //Devuelve el máximo de la pila.
     
    public int obtenerMaximo() {
        return tope.maximo;
    }
}