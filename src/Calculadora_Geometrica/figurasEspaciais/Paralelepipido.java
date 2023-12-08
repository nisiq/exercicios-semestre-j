package figurasEspaciais;

public class Paralelepipido {

    private double comprimentoParale;
    private double larguraParale;
    private double alturaParale;

    public Paralelepipido(double comprimentoParale,
                          double larguraParale,
                          double alturaParale) {
        this.comprimentoParale = comprimentoParale;
        this.larguraParale = larguraParale;
        this.alturaParale = alturaParale;
    }

    public double CalcularParale() {
        return (2 * alturaParale * larguraParale) +
                (2 * larguraParale * alturaParale) +
                (2 * comprimentoParale * alturaParale);
    }

}
