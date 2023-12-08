package figurasPlanas;

public class Quadrado {
        private double ladoQuadrado;

        public Quadrado(double ladoQuadrado) {
            this.ladoQuadrado = ladoQuadrado;
        }

        public double calcularQuadrado() {
            return ladoQuadrado * ladoQuadrado;
        }

        public double calcularPerimetroQuadrado() {
            return 4*ladoQuadrado;
        }
}
