package figurasPlanas;

public class Triangulo {
    private double baseTriangulo;
    private double alturaTriangulo;

    public Triangulo(double baseTriangulo, double alturaTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    public double CalcularTriangulo(){
        return baseTriangulo * alturaTriangulo / 2;
    }

}
