package cenario2.entidades;

public class Adulto extends Pessoa {
    public Adulto(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public boolean podeEmbarcarSozinha() {
        return true;
    }
}