package figurasPlanas;

public class Circulo {

        private double raioCirculo;

        public Circulo(double raioCirculo){
            this.raioCirculo = raioCirculo;
        }

        public double calcularCirculo() {
            return 3.14 * (raioCirculo * raioCirculo);
        }

}

