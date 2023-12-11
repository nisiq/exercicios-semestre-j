package Outros;/*Do a program with the user type it one number in terminal and verify if the number its even or odd*/

import java.util.Scanner;

public class p_i {
    public static void main(String[] args) {
        System.out.printf("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        String resultado;

        if (n % 2 == 0) {
            resultado = "O número digitado é par!";
        } else {
            resultado = "O número digitado é ímpar!";
        }
        System.out.println(resultado);
    }
}
