package ejercicio3_BitacorasSanaDistancia;

// Main
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

import java.util.Scanner;

//Simula la llegada de teléfonos y la duración de las llamadas con la clase Main
 
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int[] duraciones = new int[n];
        int[] ordenLlamadas = new int[n];

        // Leer la duración de cada llamada
        for (int i = 0; i < n; i++) {
            duraciones[i] = entrada.nextInt();
        }

        Pila pendientes = new Pila();

        int llamadaActual = 0;
        int tiempoRestante = 0;
        int llamadasRealizadas = 0;

        // simula cada minuto en que llega un teléfono
        for (int minuto = 0; minuto < n; minuto++) {
            int telefono = entrada.nextInt();

            
            pendientes.push(telefono);

            // Si la telefonista está ocupada, pasa un minuto
            if (tiempoRestante > 0) {
                tiempoRestante--;
            }

            // Si está libre, comienza la siguiente llamada
            if (tiempoRestante == 0 && llamadasRealizadas < n) {
                int siguienteTelefono = pendientes.pop();

                ordenLlamadas[llamadasRealizadas] = siguienteTelefono;
                tiempoRestante = duraciones[llamadasRealizadas];

                llamadasRealizadas++;
            }
        }

        // Terminar las llamadas que quedaron pendientes
        while (llamadasRealizadas < n) {
            if (tiempoRestante > 0) {
                tiempoRestante--;
            }

            if (tiempoRestante == 0) {
                int siguienteTelefono = pendientes.pop();

                ordenLlamadas[llamadasRealizadas] = siguienteTelefono;
                tiempoRestante = duraciones[llamadasRealizadas];

                llamadasRealizadas++;
            }
        }

        // Imprimir el orden en que se llamaron los teléfonos
        for (int i = 0; i < n; i++) {
            System.out.println(ordenLlamadas[i]);
        }

        entrada.close();
    }
}

