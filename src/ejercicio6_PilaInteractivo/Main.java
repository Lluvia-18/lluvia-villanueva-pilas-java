package ejercicio6_PilaInteractivo;

// Main
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

//funciones de la pila interactiva
 
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.agrega(5);
        System.out.println(pila.saca());
    }
}