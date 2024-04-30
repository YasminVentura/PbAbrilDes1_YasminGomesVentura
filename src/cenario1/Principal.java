package cenario1;

import cenario1.entidade.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa lily = new Pessoa("Lily");
        Pessoa wilhelm = new Pessoa("Wilhelm");
        lily.adicionarConjuge(wilhelm);

        Pessoa opa = new Pessoa("Opa", lily);
        Pessoa oma = new Pessoa("Oma");
        opa.adicionarConjuge(oma);
        lily.adicionarFilho(opa);

        opa.adicionarFilho(new Pessoa("Reinhold", opa));
        opa.adicionarFilho(new Pessoa("Wilma", opa));
        opa.adicionarFilho(new Pessoa("Sigrid", opa));

        Pessoa reinhold = opa.filhos.get(0);
        Pessoa sonia = new Pessoa("Sonia");
        reinhold.adicionarConjuge(sonia);
        reinhold.adicionarFilho(new Pessoa("Christian", reinhold));

        Pessoa christian = reinhold.filhos.get(0);
        Pessoa monica = new Pessoa("Monica");
        christian.adicionarConjuge(monica);
        christian.adicionarFilho(new Pessoa("Oscar", christian));
        christian.adicionarFilho(new Pessoa("Lorena", christian));

        Pessoa wilma = opa.filhos.get(1);
        Pessoa rodolfo = new Pessoa("Rodolfo");
        wilma.adicionarConjuge(rodolfo);
        wilma.adicionarFilho(new Pessoa("Ricardo", wilma));
        wilma.adicionarFilho(new Pessoa("Rodrigo", wilma));

        Pessoa ricardo = wilma.filhos.get(0);
        Pessoa debora = new Pessoa("Debora");
        ricardo.adicionarConjuge(debora);

        Pessoa sigrid = opa.filhos.get(2);
        Pessoa peter = new Pessoa("Peter");
        sigrid.adicionarConjuge(peter);
        sigrid.adicionarFilho(new Pessoa("Martin", sigrid));
        sigrid.adicionarFilho(new Pessoa("Thomas", sigrid));
        sigrid.adicionarFilho(new Pessoa("Claudia", sigrid));

        Pessoa martin = sigrid.filhos.get(0);
        Pessoa carla = new Pessoa("Carla");
        martin.adicionarConjuge(carla);
        martin.adicionarFilho(new Pessoa("Nicolas", martin));

        lily.imprimirArvoreGenealogica(0);
    }
}
