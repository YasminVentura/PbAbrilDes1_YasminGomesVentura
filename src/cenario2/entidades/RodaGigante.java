package cenario2.entidades;

import java.util.ArrayList;
import java.util.List;

public class RodaGigante {
    List<Gondola> gondolas;

    public RodaGigante(int numGondolas) {
        gondolas = new ArrayList<>();
        for (int i = 0; i < numGondolas; i++) {
            gondolas.add(new Gondola(i + 1));
        }
    }

    public void embarcar(Pessoa... pessoas) {
        for (Pessoa pessoa : pessoas) {
            Gondola gondolaLivre = procurarGondolaLivre();
            if (gondolaLivre != null) {
                if (pessoa.podeEmbarcarSozinha()) {
                    gondolaLivre.embarcar(pessoa);
                } else {
                    Crianca crianca = (Crianca) pessoa;
                    if (crianca.responsavel == null) {
                        System.out.println("ERRO: " + crianca.nome + " tem menos de 12 anos e o responsável não está presente");
                        continue;
                    }
                    gondolaLivre.embarcar(pessoa);
                }
            } else {
                System.out.println("ERRO: Não há gôndolas disponíveis.");
            }
        }
    }

    private Gondola procurarGondolaLivre() {
        for (Gondola gondola : gondolas) {
            if (gondola.isVazia()) {
                return gondola;
            }
        }
        return null;
    }

    public void status() {
        System.out.println("Gondola Status");
        System.out.println("----------------------");
        for (Gondola gondola : gondolas) {
            System.out.println(gondola);
        }
    }
}
