package EJ3;

public class Bebidas extends Producto{
    public String marca;

    public Bebidas(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + " marca: "+marca;
    }
}
