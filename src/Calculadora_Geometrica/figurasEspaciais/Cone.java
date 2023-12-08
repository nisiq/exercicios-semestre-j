package figurasEspaciais;

public class Cone {

    private double raioCone;
    private double geratrizCone;

    public Cone(double raioCilindro, double geratrizCone) {
        this.raioCone = raioCilindro;
        this.geratrizCone = geratrizCone;
    }

    public double CalcularCone() {
        return Math.PI*raioCone*(raioCone+geratrizCone);
    }

}
