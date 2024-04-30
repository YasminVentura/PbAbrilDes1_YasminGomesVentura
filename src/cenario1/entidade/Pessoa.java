package cenario1.entidade;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Pessoa conjuge;
    public List<Pessoa> filhos;

    public Pessoa(String nome) {
        this.nome = nome;
        this.filhos = new ArrayList<>();
    }

    public Pessoa(String nome, Pessoa conjuge) {
        this.nome = nome;
        this.conjuge = conjuge;
        this.filhos = new ArrayList<>();
    }


    public void adicionarConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    public void adicionarFilho(Pessoa filho) {
        filhos.add(filho);
    }

    public void imprimirArvoreGenealogica(int nivel) {
        StringBuilder esp = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            esp.append("    ");
        }
        String status = conjuge != null ? "Casado com: " + conjuge.nome : "Solteiro";
        System.out.println(esp.toString() + nome + " - " + status + " - Filhos:");
        if (!filhos.isEmpty()) {
            for (Pessoa filho : filhos) {
                filho.imprimirArvoreGenealogica(nivel + 1);
            }
        }
    }
}

