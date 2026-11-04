package ejercicio7_BancoClientesNoPreferentes;

// Main
// autor: Lluvia Estefania Villanueva Lazo
// GTID244
// fecha: 03 de Noviembre de 2026



import java.util.Scanner;

//Un banco con clientes no preferentes (Utiliza una cola para la fila 1 y una pila para la fila 2)
 
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cola fila1 = new Cola();
        Pila fila2 = new Pila();

        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            String evento = entrada.next();
            int fila = entrada.nextInt();

            if (evento.equals("E")) {
                String nombre = entrada.next();

                if (fila == 1) {
                    fila1.encolar(nombre);
                } else {
                    fila2.push(nombre);
                }
            } else if (evento.equals("A")) {
                if (fila == 1) {
                    System.out.println(fila1.desencolar());
                } else {
                    System.out.println(fila2.pop());
                }
            }
        }

        entrada.close();
    }
}