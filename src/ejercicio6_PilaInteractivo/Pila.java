package ejercicio6_PilaInteractivo;

// Pila
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026


//Implemento pila con las funciones agrega y saca
 
public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    //Agrega un número al tope de la pila (@param n número que se agregará)
     
    public void agrega(int n) {
        Nodo nuevo = new Nodo(n);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

   