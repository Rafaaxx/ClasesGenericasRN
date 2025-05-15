package EJ3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Almacen<Producto> almacen1=new Almacen<>();
      Alimentos al1=new Alimentos("manzana",20,"fruta");
      Alimentos al2=new Alimentos("gelatina",10,"dulce");
      Bebidas beb1=new Bebidas("Cola",5,"Coca Cola");
      Bebidas beb2=new Bebidas("Gaseosa de limom",4,"Sprite");
      ArrayList<Alimentos>array1=new ArrayList<>();
      array1.add(al1);
      array1.add(al2);
      ArrayList<Bebidas>array2=new ArrayList<>();
      array2.add(beb1);
      array2.add(beb2);
      almacen1.añadirproducto(al1);
      almacen1.añadirproducto(al2);
      almacen1.añadirproducto(beb1);
      almacen1.añadirproducto(beb2);
      almacen1.imprimirproductos(array1);
      almacen1.imprimirproductos(array2);

    }
}
