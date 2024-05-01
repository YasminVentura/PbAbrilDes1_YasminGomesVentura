package cenario2.entidades;

public abstract class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract boolean podeEmbarcarSozinha();
}
