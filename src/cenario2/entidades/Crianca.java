package cenario2.entidades;

public class Crianca extends Pessoa{
    private Adulto responsavel;

    public Crianca(String nome, Integer idade) {
        super(nome, idade);
    }

    public Crianca(String nome, Integer idade, Adulto responsavel) {
        super(nome, idade);
        this.responsavel = responsavel;
    }
}
