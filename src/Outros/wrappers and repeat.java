/*

import java.util.ArrayList;
import java.util.Scanner;

public class wrappers {
    public static void main(String[] args) throws InterruptedException {
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l= 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*3);
        System.out.println(l/3);

        TIPO PRIMITIVO NÃO TEM FUNÇÕES ASSOCIADAS A ELE

        int a =10;
        Integer b = 10;
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        System.out.println(lista);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

         double a=1;
         System.out.println(a);

         float b= (float) 1.222244499999;
        System.out.println(b);


        int c=127;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999999999999;
        int f = (int) e;
        System.out.println(f);

        //converter numero  inteiro para string
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        int num2 = 1000000;
        System.out.println(Integer.toString(num2).length());

        System.out.println((""+num2).length());

        //converter STRING pra int
        String n1 = "12";
        String n2 = "3.14";

        int x = Integer.parseInt(n1);
        double y = Double.parseDouble(n2);
        double soma = x+y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(soma);

        LAÇO DE REPETIÇÃO
        int contador = 0;

        while(contador<=20){
            System.out.printf("O contador está em %d\n",contador);
            contador++;
        stop = tem que ser boolean

        for (int i = 0 ; i<11;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }

        int x=2;
        for(;x<10;){
            System.out.println(x);
            x++;
        }
        int contador=0;

        for(;true;){
            System.out.println("Hello");
        }


        Scanner entrada = new Scanner(System.in);
        String valor = "";
        while (!valor.equalsIgnoreCase("sair")){
            System.out.printf("Digite algo: ");
            valor=entrada.nextLine();

        Scanner entrada = new Scanner(System.in);
        String valor;
        do{
            System.out.print("Diga-me algo: ");
            valor=entrada.nextLine();
        }while (!valor.equalsIgnoreCase("sair"));

        entrada.close();

        //Acumulador

        Scanner entrada = new Scanner(System.in);
        int contador = 0, acumulador = 0;

        while(contador<5){
            contador++;
            System.out.print("Digite um número: ");
            acumulador=acumulador+entrada.nextInt();
            entrada.nextLine();
            System.out.printf("O contador está em % d e "+
        "o acumulador está em %d\n",contador, acumulador);

        int contador=0, acumulador=0;
        for (int i = 0; i<5; i++){
            contador=i;
            acumulador+=i*i;
            System.out.printf("O contador está em %d e " +
                    "o acumulador está em %d\n",contador,acumulador);

        for (int i = 0; i <10 ; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i);
FOR ENCADEADO

        for (int i = 0; i < 5; i++) {
            System.out.println("Almoço");
            for (int j = 0; j < 3; j++) {
                System.out.println("Janta");
        }
    }

        }
    }

        */
