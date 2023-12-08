package Fibonacci;

/*
    Sequência de Fibonacci
    é uma sequência de números inteiros, começando normalmente por 0 e 1, na qual cada termo subsequente corresponde à soma dos dois anteriores.
        digite um n: 8
            sout 0 1 1 2 3 5 8 13
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class SequenciaFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.print("                         \n");
            System.out.print("\n    Sequência de Fibonacci\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Info Fibonacci    |\n");
            System.out.print("| Opção 2 - Escolher um numero|\n");
            System.out.print("| Opção 3 - 20 primeiros      |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = sc.nextInt();

            if (opcao == 4) {
                System.out.print("\nAté logo!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n>>>>>>> Sequência de Fibonacci <<<<<<<< ");
                    System.out.println("Na matemática, a sucessão de Fibonacci (ou sequência de Fibonacci), é uma sequência\n" +
                            "de números inteiros, começando normalmente por 0 e 1,\n" +
                            "na qual cada termo subsequente corresponde à\n" +
                            "soma dos dois anteriores.\n");
                    System.out.println("É importante destacar que a sequência de Fibonacci é infinita. Portanto, o ideal é" +
                            "que você defina um valor que tenha como objetivo");
                    break;

                case 2:
                    int numeros[] = new int[3]; //valores que serão armazenados


                    System.out.print("\nDigite um número: ");
                    int n = sc.nextInt();

                    System.out.println("\nSequencia de Fibbonacci " + n + " valores");

                    //primeiro valor da seq: 0
                    numeros[0] = 0;
                    numeros[1] = 1;
                    numeros[2] = 0;


                    for (int i = 0; i < n; i++) {
                        System.out.print(numeros[0] + " ");

                        //Soma dos valores anteriores
                        numeros[2] = numeros[0] + numeros[1];
                        numeros[0] = numeros[1];
                        numeros[1] = numeros[2];
                    }
                    break;

                case 3:
                    int numerosv[] = new int[3]; //valores que serão armazenados

                    int v = 20;

                    System.out.println("\nSequencia de Fibbonacci " + v + " valores");

                    //primeiro valor da seq: 0
                    numerosv[0] = 0;
                    numerosv[1] = 1;
                    numerosv[2] = 0;


                    for (int i = 0; i < v; i++) {
                        System.out.print(numerosv[0] + " ");

                        //Soma dos valores anteriores
                        numerosv[2] = numerosv[0] + numerosv[1];
                        numerosv[0] = numerosv[1];
                        numerosv[1] = numerosv[2];
                    }
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}