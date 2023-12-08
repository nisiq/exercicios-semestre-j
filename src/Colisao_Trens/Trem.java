public class Trem {
    private int posicaoTremA;
    private int posicaoTremB;
    private int velocidadeTremA;
    private int velocidadeTremB;

    public Trem(int posicaoTremA, int posicaoTremB, int velocidadeTremA, int velocidadeTremB) {
        this.posicaoTremA = posicaoTremA;
        this.posicaoTremB = posicaoTremB;
        this.velocidadeTremA = velocidadeTremA;
        this.velocidadeTremB = velocidadeTremB;
    }

    public int CalcularTempo() {
        return (posicaoTremA - posicaoTremB) / (velocidadeTremA = velocidadeTremB) * 3600;
    }

    public int PosicaoFinalA() {
        return posicaoTremA + velocidadeTremA * CalcularTempo();
    }

    public int PosicaoFinalB() {
        return posicaoTremB + velocidadeTremB * CalcularTempo();
    }
}