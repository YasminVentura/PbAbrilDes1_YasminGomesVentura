package cenario2.entidades;

public class RodaGigante {
    private Gondola[] gondolas;

    public RodaGigante() {
        this(18);
    }

    public RodaGigante(int numGondolas) {
        gondolas = new Gondola[numGondolas];
        for (int i = 0; i < numGondolas; i++) {
            gondolas[i] = new Gondola(i + 1);
        }
    }

    public void embarcar(int numGondola, Pessoa... pessoas) {
        if (numGondola <= 0 || numGondola > gondolas.length) {
            System.out.println("ERRO: Gôndola inválida.");
            return;
        }

        Gondola gondola = gondolas[numGondola - 1];

        if (gondola.cheia()) {
            System.out.println("ERRO: A gôndola está cheia.");
            return;
        }

        for (Pessoa pessoa : pessoas) {

            if (pessoa instanceof Crianca) {
                Crianca crianca = (Crianca) pessoa;

                if (crianca.getIdade() < 12) {

                    if (crianca.getResponsavel() == null) {
                        System.out.println("ERRO: " + crianca.getNome() + " não pode entrar sem um responsável.");
                        return;
                    }

                    boolean responsavelPresente = false;

                    for (Pessoa p : pessoas) {
                        if (p.equals(crianca.getResponsavel())) {
                            responsavelPresente = true;
                            break;
                        }
                    }

                    if (!responsavelPresente) {
                        System.out.println("ERRO: " + crianca.getNome() + " precisa estar acompanhado pelo responsável.");
                        return;
                    }

                }

            }
            gondola.embarcar(pessoa);

        }
    }


    public void status() {
        System.out.println();
        System.out.println("Gondola Status");
        System.out.println("----------------------");
        for (Gondola gondola : gondolas) {
            System.out.println(gondola);
        }
    }
}