package EJ1;

public class Implementacion implements Operable<Integer>{
    @Override
    public Integer suma(Integer valor1, Integer valor2) {
        return valor1+valor2;
    }

    @Override
    public Integer resta(Integer valor, Integer valor2) {
        return valor-valor2;
    }

    @Override
    public Integer multiplicacion(Integer valor, Integer valor2) {
        return valor*valor2;
    }

    @Override
    public Integer division(Integer valor, Integer valor2) {
        return valor*valor2;
    }

}
