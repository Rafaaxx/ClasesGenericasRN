package EJ4;

public class Productos2 extends ProductoSuperior1 {
        public String nombre;
        public double precio;

    public Productos2(int calificacionennumero, String calificacion, String nombre, double precio) {
        super(calificacionennumero, calificacion);
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString()+ "Productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}


