import figurasEspaciais.*;
import figurasPlanas.*;
import java.util.Locale;
import java.util.Scanner;

//calc

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        while (true) {

            System.out.print("                         \n");
            System.out.print("\n    Calculadora Geometrica \n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Figuras Planas    |\n");
            System.out.print("| Opção 2 - Figuras Espaciais |\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao1 = sc.nextInt();

            if (opcao1 == 3) {
                System.out.print("\nAté logo!");
                break;
            }

            switch (opcao1) {
                case 1:
                    System.out.print("                         \n");
                    System.out.print("\n    Figuras Planas           \n");
                    System.out.print("|----------------------------- |\n");
                    System.out.print("| Opção 1 - Circulo            |\n");
                    System.out.print("| Opção 2 - Hexagono Regular   |\n");
                    System.out.print("| Opção 3 - Quadrado           |\n");
                    System.out.print("| Opção 4 - Retangulo          |\n");
                    System.out.print("| Opção 5 - Triangulo          |\n");
                    System.out.print("| Opção 6 - Triang. Equilatero |\n");
                    System.out.print("|-----------------------------|\n");
                    System.out.print("Digite uma opção: ");

                    int opcao2 = sc.nextInt();

                    switch(opcao2) {
                        case 1: //QUADRADO
                            System.out.print("Digite o lado do quadrado: ");
                            double ladoQuadrado = sc.nextDouble();

                            Quadrado quadrado = new Quadrado(ladoQuadrado);

                            System.out.println("Área do Quadrado: " + quadrado.calcularQuadrado());
                            System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetroQuadrado());
                            break;

                        case 2: //CIRCULO
                            System.out.print("Digite o valor do raio do circulo: ");
                            double raioCirculo = sc.nextDouble();
                            Circulo circulo = new Circulo(raioCirculo);
                            System.out.println("Area do Circulo: " + circulo.calcularCirculo());
                            break;

                        case 3: //HEXAGONO
                            System.out.print("Digite o valor de um lado do Hexagono Regular: ");
                            double ladoHexagono = sc.nextDouble();
                            HexagonoRegular hexagonoRegular = new HexagonoRegular(ladoHexagono);
                            System.out.println("Area do Hexagono Regular: " + hexagonoRegular.calcularHexagono());
                            break;

                        case 4: //RETANGULO
                            System.out.print("Digite a base do retangulo: ");
                            double baseRetangulo = sc.nextDouble();

                            System.out.println("Digite a altura do retangulo: ");
                            double alturaRetangulo = sc.nextDouble();

                            Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
                            System.out.println("Area do Retangulo: " + retangulo.CalcularRetangulo());
                            break;


                        case 5: //TRIANGULO
                            System.out.print("Digite o valor da base do triangulo: ");
                            double baseTriangulo = sc.nextDouble();

                            System.out.print("Digite o valor da altura do triangulo: ");
                            double alturaTriangulo = sc.nextDouble();

                            Triangulo triangulo = new Triangulo(baseTriangulo,  alturaTriangulo);
                            System.out.println("Area do triangulo: " + triangulo.CalcularTriangulo());
                            break;


                        case 6: //TRIANGULO EQUILATERO
                            System.out.print("Digite o valor do lado do triangulo equilatero: ");
                            double ladoTrianguloEq = sc.nextDouble();

                            TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(ladoTrianguloEq);
                            System.out.println("Area do triangulo equilatero: " + trianguloEquilatero.CalcularTrianguloEq());
                            System.out.println("Perimetro do triangulo equilatero: " + trianguloEquilatero.CalcularPerimetroTrianguloEq());
                            break;

                        default:
                            System.out.println("Opção Invalida");
                            break;
                    }
                    break;

                    //FIGURAS ESPACIAIS
                case 2:
                    System.out.println("\nFiguras Espaciais");
                    System.out.println("|----------------------------- |");
                    System.out.println("| Opção 1 - Cilindro          |");
                    System.out.println("| Opção 2 - Cone              |");
                    System.out.println("| Opção 3 - Cubo              |");
                    System.out.println("| Opção 4 - Esfera            |");
                    System.out.println("| Opção 5 - Paralelepipedo    |");
                    System.out.println("| Opção 6 - Piramide Quadrada |");
                    System.out.println("|----------------------------- |");
                    System.out.print("Digite uma opção: ");

                    int opcao3 = sc.nextInt();

                    switch(opcao3) {
                        case 1: //CILINDRO
                            System.out.print("Digite o raio do cilindro(r): ");
                            double raioCilindro = sc.nextDouble();

                            System.out.print("Digite a altura do cilindro(h): ");
                            double alturaCilindro = sc.nextDouble();

                            Cilindro cilindro = new Cilindro(raioCilindro, alturaCilindro);
                            System.out.println("Area do Cilindro: " + cilindro.CalcularCilindro());
                            break;

                        case 2: //CONE
                            System.out.print("Digite o raio do cone(r): ");
                            double raioCone = sc.nextDouble();

                            System.out.print("Digite a geratriz do cone(g): ");
                            double geratrizCone = sc.nextDouble();

                            Cone cone = new Cone(raioCone, geratrizCone);
                            System.out.println("Area do Cone: " + cone.CalcularCone());
                            break;

                        case 3: //CUBO
                            System.out.print("Digite o valor de uma das arestas do cubo(a): ");
                            double arestaCubo = sc.nextDouble();

                            Cubo cubo = new Cubo(arestaCubo);
                            System.out.println("Area do Cubo: " + cubo.CalcularCubo());
                            break;

                        case 4: //ESFERA
                            System.out.print("Digite o raio da esfera(r): ");
                            double raioEsfera = sc.nextDouble();

                            Esfera esfera = new Esfera(raioEsfera);
                            System.out.println("Area da Superficie da Esfera: " + esfera.CalcularEsfera());
                            break;

                        case 5: //PARALELEPIPEDO
                            System.out.print("Digite o comprimento do paralelepipedo (a): ");
                            double comprimentroParale = sc.nextDouble();

                            System.out.print("Digite a largura do paralelepipedo (b): ");
                            double larguraParale = sc.nextDouble();

                            System.out.print("Digite a altura do paralelepipedo (c): ");
                            double alturaParale = sc.nextDouble();

                            Paralelepipido paralelepipido = new Paralelepipido(comprimentroParale, larguraParale, alturaParale);
                            System.out.println("Area total do paralelepipedo: " + paralelepipido.CalcularParale());
                            break;

                        case 6: //PIRAMIDE QUADRADA
                            System.out.print("Digite o valor de um dos lados da base quadrada(l): ");
                            double ladoPiramideQua = sc.nextDouble();

                            System.out.print("Agora digite a altura(h): ");
                            double alturaPiramideQua = sc.nextDouble();

                            PiramideQuadrada piramideQuadrada = new PiramideQuadrada(ladoPiramideQua, alturaPiramideQua);
                            System.out.println("Area da superficie: " + piramideQuadrada.CalcularPiramideQua());
                            break;

                        default:
                            System.out.println("Opção Invalida");
                            break;

                    }
                }
            }
        }
    }
