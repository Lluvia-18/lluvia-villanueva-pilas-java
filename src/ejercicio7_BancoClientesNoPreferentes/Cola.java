package ejercicio7_BancoClientesNoPreferentes;

// Cola
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026


//Cola de clientes que se atienden en orden de llegada.
 
public class Cola {
    private Nodo frente;
    private Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    //Agrega un cliente al final de la cola.
     
    public void encolar(String nombre) {
        Nodo nuevo = new Nodo(nombre);

        if (frente == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    //Retira y devuelve al primer cliente.
     
    public String desencolar() {
        if (frente == null) {
            return "";
        }

        String nombre = frente.nombre;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return nombre;
    }
}