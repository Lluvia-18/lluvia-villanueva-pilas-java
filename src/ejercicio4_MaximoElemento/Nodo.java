package ejercicio4_MaximoElemento;

// Nodo
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

//Nodo que guarda un número y el máximo de la pila hasta ese nodo.
 
public class Nodo {
    int dato;
    int maximo;
    Nodo siguiente;

    public Nodo(int dato, int maximo) {
        this.dato = dato;
        this.maximo = maximo;
        this.siguiente = null;
    }
}