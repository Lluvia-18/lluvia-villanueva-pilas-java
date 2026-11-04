package ejercicio7_BancoClientesNoPreferentes;

// Nodo
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

//Nodo que almacena el nombre de un cliente.
 
public class Nodo {
    String nombre;
    Nodo siguiente;

    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }
}