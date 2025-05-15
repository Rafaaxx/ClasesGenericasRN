package EJ2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PilaArray <E> {
    public E[] lista;
    public int contador;
    public int contadordeelementos = 0;

    public PilaArray(int contador) {
        this.contador = contador;
        this.lista = (E[]) new Object[contador];
    }

    public boolean estavacia() {
        if (contadordeelementos == 0) {
            System.out.println("La lista está vacía.");
            return true;
        } else {
            return false;
        }
    }

    public boolean añadir(E valor) {
        if (contadordeelementos < lista.length) {
            lista[contadordeelementos] = valor;
            contadordeelementos++;
            return true;
        } else {
            return false;
        }
    }

    public E primero() {
        if (estavacia()) {
            throw new NoSuchElementException();
        } else {
            return lista[contadordeelementos - 1];
        }

    }

    public E extraer() {
        if (estavacia()) {
            throw new NoSuchElementException();
        } else {
            contadordeelementos -= 1;
            return lista[contadordeelementos];
        }
    }

    public void mostrarelementos() {
        System.out.println("Los elementos de la lista son: ");
        for (int i = 0; i < contadordeelementos; i++) {
            System.out.println(lista[i]);
        }
    }
}

