package ejercicio3_BitacorasSanaDistancia;

// Nodo
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026


//Pila de teléfonos pendientes de llamar.
 
public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    //Agrega un teléfono a la pila.
     
    public void push(int telefono) {
        Nodo nuevo = new Nodo(telefono);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

  