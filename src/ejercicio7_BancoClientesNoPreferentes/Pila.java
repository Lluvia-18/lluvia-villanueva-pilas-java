package ejercicio7_BancoClientesNoPreferentes;

// Pila
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

//Pila de clientes que se atienden en orden inverso
 
public class Pila {
    private Nodo tope;

    public Pila() {
        tope = null;
    }

    //Agrega un cliente al tope
     
    public void push(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    //Retira y devuelve al último cliente que llegó
     
    public String pop() {
        if (tope == null) {
            return "";
        }

        String nombre = tope.nombre;
        tope = tope.siguiente;
        return nombre;
    }
}