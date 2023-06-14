/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolbinario;

import java.util.Scanner;

/**
 *
 * @author Usuario_PC
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Arbol arbol = new Arbol();
        Scanner leer = new Scanner(System.in);
        int opcion;
        System.out.println("=========Arbol Binario con recorridos=======");

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Insertar valor");
            System.out.println("2. Recorrido en preorden");
            System.out.println("3. Recorrido inorden");
            System.out.println("4. Recorrido postorden");
            System.out.println("5. Mostrar ARBOL BINARIO");
            System.out.println("6. SALIR");
            System.out.print("INGRESA TU OPCION ===> ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor a insertar: ");
                    int valor = leer.nextInt();
                    arbol.insertar(valor);
                    break;
                case 2:
                    System.out.print("Recorrido en preorden=====> ");
                    arbol.preorden(arbol.raiz);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Recorrido inorden=====> ");
                    arbol.inorden(arbol.raiz);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Recorrido postorden=====> ");
                    arbol.postorden(arbol.raiz);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Mostrando el árbol binario:");
                    arbol.mostrarArbol();
                    System.out.println();
                    break;

                case 6:
                    System.out.println("======GRACIAS POR USAR========");
                    break;
                default:
                    System.out.println("=======OPCION NO VALIDA=======");
                    break;
            }
        } while (opcion != 5);
    }

}
