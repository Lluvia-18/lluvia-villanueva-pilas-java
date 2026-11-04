package ejercicio5_ParentesisBalanceados;

// Main
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026

import java.util.Scanner;

//Comprueba que cada apertura tenga su cierre
 
public class Main {

    //Revisa si una cadena tiene los paréntesis
     
    public static boolean estaBalanceada(String cadena) {
        Pila pila = new Pila();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter);
            } else {
                if (pila.estaVacia()) {
                    return false;
                }

                char apertura = pila.pop();

                if (caracter == ')' && apertura != '(') {
                    return false;
                }

                if (caracter == '}' && apertura != '{') {
                    return false;
                }

                if (caracter == ']' && apertura != '[') {
                    return false;
                }
            }
        }

        return pila.estaVacia();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int casos = entrada.nextInt();

        for (int i = 0; i < casos; i++) {
            String cadena = entrada.next();

            if (estaBalanceada(cadena)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        entrada.close();
    }
}