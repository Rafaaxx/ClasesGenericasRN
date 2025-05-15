package EJ4;

public class ProductoSuperior1 extends Megaproducto{
    public String calificacion;

    public ProductoSuperior1(int calificacionennumero, String calificacion) {
        super(calificacionennumero);
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Califcacion en letra: "+calificacion;
    }
}
