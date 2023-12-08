package Eliminar_Metade;

import java.util.ArrayList;

public class Aprendiz {

    private String nome;

    public Aprendiz(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString(){
        return nome;
    }
}
