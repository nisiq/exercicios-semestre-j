package Eliminar_Metade;

import java.util.ArrayList;
import java.util.List;
import java.lang.Thread;
import java.util.Random;
import java.util.Scanner;

public class Remove {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        do {
            List<Aprendiz> listaDeAprendizes = new ArrayList<>();

            listaDeAprendizes.add(new Aprendiz("Allana"));
            listaDeAprendizes.add(new Aprendiz("Angelo"));
            listaDeAprendizes.add(new Aprendiz("Caio"));
            listaDeAprendizes.add(new Aprendiz("Carlos"));
            listaDeAprendizes.add(new Aprendiz("Diego"));
            listaDeAprendizes.add(new Aprendiz("Diegao"));
            listaDeAprendizes.add(new Aprendiz("Eduarda"));
            listaDeAprendizes.add(new Aprendiz("Esther"));
            listaDeAprendizes.add(new Aprendiz("Felipe"));
            listaDeAprendizes.add(new Aprendiz("Giovana"));
            listaDeAprendizes.add(new Aprendiz("Fiuza"));
            listaDeAprendizes.add(new Aprendiz("Radaeli"));
            listaDeAprendizes.add(new Aprendiz("Henrique"));
            listaDeAprendizes.add(new Aprendiz("Julia"));
            listaDeAprendizes.add(new Aprendiz("Laura"));
            listaDeAprendizes.add(new Aprendiz("Lucas"));
            listaDeAprendizes.add(new Aprendiz("Nicole"));
            listaDeAprendizes.add(new Aprendiz("Gabriel"));
//18 par

            int listaCompleta = listaDeAprendizes.size();
            int remover = listaCompleta / 2; //metade da lista(9)

            System.out.println("Um segundo... Estou realizando uma analise dos sobreviventes e removidos... HEHE");
            Thread.sleep(2000);

            System.out.println("====================================");

            //remover aprendizes aleatoriamente
            for (int i = 0; i < remover; i++) {
                int aleatorio = random.nextInt(listaDeAprendizes.size());
                Aprendiz aprendizRemovido = listaDeAprendizes.remove(aleatorio);
                System.out.println("removidos: " + aprendizRemovido);
            }

            System.out.println("====================================");

            Thread.sleep(2000);

            // Aprendizes nao removidos
            for (Aprendiz aprendiz : listaDeAprendizes) {
                System.out.println("sobreviventes: " + aprendiz);

            }
            System.out.println("=====================================================================");
            System.out.print("Deseja sortear novamente? Digite (S) para sim ou qualquer outra tecla para nao): ");
        } while (sc.nextLine().equalsIgnoreCase("S"));
    }
}
