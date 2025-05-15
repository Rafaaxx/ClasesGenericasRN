package EJ3;

public class Alimentos extends Producto{
    public String tipo;

    public Alimentos(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" tipo: "+tipo;
    }
}
