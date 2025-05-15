package EJ3;

import java.util.ArrayList;
import java.util.List;

public class Almacen <T>{
    private List<T>listaprod=new ArrayList<>();
    public void añadirproducto(T producto){
        listaprod.add(producto);
    }
    public void imprimirproductos( List <? extends T> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
}
