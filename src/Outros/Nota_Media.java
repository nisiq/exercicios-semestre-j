package Outros;

public class Nota_Media {
    public static void main(String[] args) {
        double media = 4.1;
        int  faltas = 20;
        boolean postura = false;
        String situacao;

        if(media>=5.0 && faltas<25 && postura==true){
            situacao="Aprovado";
        }
        else if (media<5.0 && faltas<25 && postura){
            situacao="Prova de Recuperação";
        }
        else if(media>5.0 && faltas>=25 && postura){
            situacao="Sem férias";
        }
        else if(media>5.0 && faltas<25 && !postura){
            situacao="Chamar pra conversar";
        }
        else{
            situacao="Reprovado";
        }
        System.out.println(situacao);
    }
}
