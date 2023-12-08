package Colisao_Trens;

import java.util.Scanner;

public class Colisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menorExtremidade = 0;
        int maiorExtremidade = 10000;
        int posicaoFinal = 0;

        System.out.println("Posicao do Trem A: ");
        int posicaoInicialTremA = sc.nextInt();

        System.out.println("Posicao do Trem B: ");
        int posicaoInicialTremB = sc.nextInt();

        int velocidadeTremA;
        do {
            System.out.println("Velocidade do trem A (apenas numeros positivos): ");
            velocidadeTremA = sc.nextInt();
            if (velocidadeTremA <= 0) {
                System.out.println("Insira um valor positivo...");
            }
        } while (velocidadeTremA <= 0);

        int velocidadeTremB;
        do {
            System.out.println("Velocidade do trem B (apenas numeros negativos): ");
            velocidadeTremB = sc.nextInt();
            if (velocidadeTremB >= 1) {
                System.out.println("Insira um valor negativo...");
            }
        } while (velocidadeTremB > 0);

        int tempo = (posicaoInicialTremA - posicaoInicialTremB) / (velocidadeTremB - velocidadeTremA);

        int posicaoFinalB = posicaoInicialTremB + velocidadeTremB * tempo;

        System.out.println("A colisao dos trens acontecera no KM " + posicaoFinalB + " e no tempo " + tempo*3600);

    }
}