package ejercicio1_AtestamientoDelCallejon;

// Main
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

import java.util.Scanner;

// Clase main que resuelve el problema de entregar el automóvil que se solicita contando cuántos autos deben salir 
 
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        Pila autos = new Pila();

        // Se guardan las placas en el orden de llegada.
        for (int i = 0; i < n; i++) {
            autos.push(entrada.next());
        }

        String solicitado = entrada.next();
        int contador = 0;
        boolean encontrado = false;

        // Se retiran los autos hasta encontrar el solicitado.
        while (!autos.estaVacia()) {
            String placa = autos.pop();
            contador++;

            if (placa.equals(solicitado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println(contador);
        } else {
            System.out.println("No existe el auto");
        }

        entrada.close();
    }
}