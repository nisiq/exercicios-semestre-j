package Outros;

import java.util.Scanner;

/*Do a program that when type it one number in terminal
* Print Fizz if a number its two multiple
* Print Fizz if a number its five multiple
* Print FizzBuzz if a number its two and five multiple
* Print ERROR if none situation above its correct
* */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.printf("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        String resultado;

        if(n%2==0){
            resultado="FIZZ";
            System.out.println(resultado);

        }
        if(n%5==0){
            resultado="BUZZ";
            System.out.println(resultado);

        }
        if(n%2==0 && n%5==0){
            resultado="FizzBuzz";
            System.out.println(resultado);

        }
    }
}
