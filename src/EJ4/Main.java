package EJ4;

import EJ3.Producto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Almacen2<Productos2> almacen=new Almacen2<>();
        Megaproducto mega1=new Megaproducto(9);
        ProductoSuperior1 productoSuperior1=new ProductoSuperior1(8,"B");
        Productos2 productos1=new Productos2(9,"A","Manzana", 17);
        almacen.añadirproducto(productos1);
        ArrayList<Megaproducto>array1=new ArrayList<>();
        ArrayList<ProductoSuperior1>array2=new ArrayList<>();
        array1.add(mega1);
        array1.add(productos1);
        array2.add(productoSuperior1);

        almacen.imprimirelementos(array2);
        almacen.imprimirelementos(array1);
    }
}
