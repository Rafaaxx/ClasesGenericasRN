package EJ4;

import EJ3.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
public class Almacen2 <T>{
    private List<? super T> listaprod = new ArrayList<>();

    public void añadirproducto(T producto) {
        listaprod.add(producto);
    }
    public void imprimirelementos(List<? super T> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }

    }
}

