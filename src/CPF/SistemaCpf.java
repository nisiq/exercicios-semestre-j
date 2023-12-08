package CPF;

import java.util.*;

public class SistemaCpf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um cpf para validarmos: ");
        String cpf_enviado_usuario = sc.nextLine();

        String nove_digitos = cpf_enviado_usuario.substring(0, 9);
        int contador_regressivo_1 = 10;
        int resultado_1 = 0;


        for (char digito : nove_digitos.toCharArray()) {
            resultado_1 += Character.getNumericValue(digito) * contador_regressivo_1;
            contador_regressivo_1 -= 1;
        }


        int digito_1 = (resultado_1 * 10) % 11;
        System.out.println(digito_1);
        System.out.println("acimaa");

        digito_1 = digito_1 <= 9 ? digito_1 : 0;
        String dez_digitos = nove_digitos + digito_1;
        int contador_regressivo_2 = 11;
        int resultado_2 = 0;


        for (char digito : dez_digitos.toCharArray()) {
            resultado_2 += Character.getNumericValue(digito) * contador_regressivo_2;
            contador_regressivo_2 -= 1;
        }


        int digito_2 = (resultado_2 * 10) % 11;
        digito_2 = digito_2 <= 9 ? digito_2 : 0;
        String cpf_gerado = nove_digitos + digito_1 + digito_2;
        if (cpf_enviado_usuario.equals(cpf_gerado)) {
            System.out.println(cpf_enviado_usuario + " é válido");
        } else {
            System.out.println("CPF inválido");
        }
    }
}