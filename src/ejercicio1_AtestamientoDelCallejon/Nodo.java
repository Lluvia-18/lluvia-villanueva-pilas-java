package ejercicio1_AtestamientoDelCallejon;

// Nodo
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026


//se agrega la clase nodo

public class Nodo {
    String placa;
    Nodo siguiente;

 // Crea un nodo con la placa recibida.
  
    public Nodo(String placa) {
        this.placa = placa;
        this.siguiente = null;
    }
}