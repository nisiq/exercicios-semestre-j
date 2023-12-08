package figurasEspaciais;

public class Cilindro {

    private double raioCilindro;
    private double alturaCilindro;

    public Cilindro(double raioCilindro, double alturaCilindro) {
        this.raioCilindro = raioCilindro;
        this.alturaCilindro = alturaCilindro;
    }

    public double CalcularCilindro(){
        return 2*Math.PI*raioCilindro*(raioCilindro+alturaCilindro);
    }

}
