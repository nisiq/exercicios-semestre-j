import java.util.Scanner;

//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

public class potenciacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n;
        n = entrada.nextInt();

        int quadrado = (n*n);
        int cubo = (n*n*n);

        System.out.printf("O valor (ao quadrado) de %d é -> %d\n", n, quadrado);
        System.out.printf("O valor (ao cubo) de %d é -> %d\n", n, cubo);
    }

}
