package figurasEspaciais;

import java.util.Locale;
import java.util.Scanner;

public class PiramideQuadrada {

    private double ladoPiramideQua;
    private double alturaPiramideQua;

    public PiramideQuadrada(double ladoPiramideQua, double alturaPiramideQua) {
        this.ladoPiramideQua = ladoPiramideQua;
        this.alturaPiramideQua = ladoPiramideQua;
    }

    public double CalcularPiramideQua(){
        return Math.pow(ladoPiramideQua, 2) + 2*ladoPiramideQua*alturaPiramideQua;
    }

}
