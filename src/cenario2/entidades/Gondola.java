package cenario2.entidades;

public class Gondola {
    private int numero;
    private Pessoa[] assentos;

    public Gondola(int numero) {
        this.numero = numero;
        this.assentos = new Pessoa[2];
    }

    public boolean vazia() {
        return assentos[0] == null && assentos[1] == null;
    }

    public boolean cheia() {
        return assentos[0] != null && assentos[1] != null;
    }

    public void embarcar(Pessoa pessoa) {
        for (int i = 0; i < assentos.length; i++) {
            if (assentos[i] == null) {
                assentos[i] = pessoa;
                break;
            }
        }
    }

    @Override
    public String toString() {
        if (vazia()) {
            return numero + " (Vazio)";
        } else {
            return numero + " " + assentos[0].getNome()
                    + (assentos[1] != null ? " e " + assentos[1].getNome() : "");
        }
    }
}