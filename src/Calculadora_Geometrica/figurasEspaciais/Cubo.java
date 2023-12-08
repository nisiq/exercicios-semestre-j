package figurasEspaciais;

public class Cubo {

    private double arestaCubo;

    public Cubo(double arestaCubo) {
        this.arestaCubo = arestaCubo;
    }

    public double CalcularCubo() {
        return 6*Math.pow(arestaCubo, 2);
    }

}
