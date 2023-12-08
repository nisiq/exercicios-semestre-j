package figurasPlanas;

public class TrianguloEquilatero {

    private double ladoTrianguloEq;

    public TrianguloEquilatero(double ladoTrianguloEq) {
        this.ladoTrianguloEq = ladoTrianguloEq;
    }

    public double CalcularTrianguloEq() {
        return (Math.pow(ladoTrianguloEq, 2) * Math.sqrt(3))/4;
    }

    public double CalcularPerimetroTrianguloEq() {
        return ladoTrianguloEq * 3;
    }

}