package ejercicio3_EasyStack;

// Maina
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026


import java.util.Scanner;

//Procesa instrucciones Push, Pop y Top.
 
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pila pila = new Pila();

        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            int operacion = entrada.nextInt();

            if (operacion == 1) {
                int numero = entrada.nextInt();
                pila.push(numero);
            } else if (operacion == 2) {
                pila.pop();
            } else if (operacion == 3) {
                System.out.println(pila.top());
            }
        }

        entrada.close();
    }
}