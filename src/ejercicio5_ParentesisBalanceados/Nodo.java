package ejercicio5_ParentesisBalanceados;

// Nodo
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

//Nodo que almacena un carácter
 
public class Nodo {
    char dato;
    Nodo siguiente;

    public Nodo(char dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}