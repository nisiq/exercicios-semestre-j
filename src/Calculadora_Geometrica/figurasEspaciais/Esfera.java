package figurasEspaciais;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {

    private double raioEsfera;

    public Esfera(double raioEsfera) {
        this.raioEsfera = raioEsfera;
    }

    public double CalcularEsfera(){
        return (4* 3.14)*Math.pow(raioEsfera, 2);
    }

}
