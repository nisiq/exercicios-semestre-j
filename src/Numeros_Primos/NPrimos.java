import java.util.Scanner;

public class NPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("                               \n");
            System.out.print("\n    Números Primos             \n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - O que são?        |\n");
            System.out.print("| Opção 2 - Validação de N. P.|\n");
            System.out.print("| Opção 3 - Sequencia de N. P.|\n");
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
                    System.out.println("\n>>>>>>> Números Primos <<<<<<<< ");
                    System.out.println("\"Um número é classificado como primo se ele é maior do que 1 e é divisível apenas por 1 e por ele mesmo \n");
                    break;


                case 2:
                    System.out.print("\nDigite um número para validarmos se ele é primo ou não: ");
                    int np = sc.nextInt();

                    if (np > 1 && np % 1 == 0 && np % np == 0) {
                        System.out.printf("O número: %d é primo!", np);
                        break;
                    } else {
                        System.out.printf("O número: %d não é primo!", np);
                        break;
                    }


                case 3:

                    System.out.print("Digite um numero e observe a sequencia de primos até ele: ");
                    int n = sc.nextInt();

                    for(int i = 2; i <= n; i++) {
                        boolean primo = true;
                        for(int j = 2; j < i; j++) {
                            if(i % j == 0) {
                                primo = false;
                            }
                        }
                        if(primo) {
                            System.out.printf(" %d ", i);
                        }
                    }
                    break;


                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        }
    }
}