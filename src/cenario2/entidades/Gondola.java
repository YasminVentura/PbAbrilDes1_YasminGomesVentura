package cenario2.entidades;

public class Gondola {
    int numero;
    Pessoa assento1;
    Pessoa assento2;

    public Gondola(int numero) {
        this.numero = numero;
    }

    boolean isVazia() {
        return assento1 == null && assento2 == null;
    }

    void embarcar(Pessoa pessoa) {
        if (assento1 == null) {
            assento1 = pessoa;
        } else if (assento2 == null) {
            assento2 = pessoa;
        }
    }

    @Override
    public String toString() {
        if (assento1 != null && assento2 != null) {
            return numero + " " + assento1.nome + " e " + assento2.nome;
        } else {
            return numero + " (Vazio)";
        }
    }
}
