package Outros;

import java.util.Scanner;
public class Calculo_imc {
    //ler peso e altura do usuário > calcular IMC

    public static void main(String[] args) {
        System.out.print("Digite o peso do usuário: ");
        Scanner entrada = new Scanner(System.in);
        float peso;
        peso=entrada.nextFloat();

        System.out.print("Digite a altura do usuário: ");
        float altura;
        altura=entrada.nextFloat();

        float imc = (peso/(altura*altura));

        System.out.printf("O IMC deste usuário é: %.2f kg/m²", imc);

    }
}
