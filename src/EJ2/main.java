package EJ2;

public class main {
    public static void main(String[] args) {
        PilaArray pila = new PilaArray<>(10);
        pila.estavacia();
        pila.añadir(20);
        pila.añadir(1);
        pila.estavacia();
        System.out.println(pila.primero());
        System.out.println(pila.extraer());
        System.out.println(pila.extraer());
        pila.mostrarelementos();
    }
}
