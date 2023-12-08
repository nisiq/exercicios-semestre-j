package figurasPlanas;

public class HexagonoRegular {

    private double ladoHexagono;

    public HexagonoRegular(double ladoHexagono) {
        this.ladoHexagono = ladoHexagono;

    }

    public double calcularHexagono() {
        return ((6 *(ladoHexagono * ladoHexagono * Math.sqrt(3))) / 4);

    }
}
