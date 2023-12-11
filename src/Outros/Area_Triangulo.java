package Outros;

import java.util.Scanner;
public class Area_Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        double base;
        base = entrada.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura;
        altura = entrada.nextDouble();

        double area = (base*altura/2);

        System.out.printf("A área do triângulo é igual a: %.2f",area);
    }
}
