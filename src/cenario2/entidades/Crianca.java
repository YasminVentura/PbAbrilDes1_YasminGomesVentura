package cenario2.entidades;

public class Crianca extends Pessoa {
    Pessoa responsavel;

    public Crianca(String nome, int idade) {
        super(nome, idade);
    }

    public Crianca(String nome, int idade, Pessoa responsavel) {
        super(nome, idade);
        this.responsavel = responsavel;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }
}
