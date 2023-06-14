/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinario;

/**
 *
 * @Estefania Cale
 */
public class Arbol {

    Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    // ...
    public void mostrarArbol() {
        mostrarArbolRec(raiz, 0);
    }

    private void mostrarArbolRec(Nodo nodo, int nivel) {
        if (nodo == null) {
            return;
        }

        mostrarArbolRec(nodo.derecho, nivel + 1);

        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }

        System.out.println(nodo.valor);

        mostrarArbolRec(nodo.izquierdo, nivel + 1);
    }

    public void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    public void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    public void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}
