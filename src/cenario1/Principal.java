package cenario1;

import cenario1.entidade.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa lily = new Pessoa("Lily");
        Pessoa wilhelm = new Pessoa("Wilhelm");
        lily.adicionarConjuge(wilhelm);

        Pessoa opa = new Pessoa("Opa");
        Pessoa oma = new Pessoa("Oma");
        opa.adicionarConjuge(oma);
        lily.adicionarFilho(opa);

        opa.adicionarFilho(new Pessoa("Reinhold"));
        opa.adicionarFilho(new Pessoa("Wilma"));
        opa.adicionarFilho(new Pessoa("Sigrid"));

        Pessoa reinhold = opa.filhos.get(0);
        Pessoa sonia = new Pessoa("Sonia");
        reinhold.adicionarConjuge(sonia);
        reinhold.adicionarFilho(new Pessoa("Christian"));
        reinhold.adicionarFilho(new Pessoa("Gabrielle"));
        reinhold.adicionarFilho(new Pessoa("Sabine"));

        Pessoa christian = reinhold.filhos.get(0);
        Pessoa monica = new Pessoa("Monica");
        christian.adicionarConjuge(monica);
        christian.adicionarFilho(new Pessoa("Oscar"));
        christian.adicionarFilho(new Pessoa("Lorena"));

        Pessoa wilma = opa.filhos.get(1);
        Pessoa rodolfo = new Pessoa("Rodolfo");
        wilma.adicionarConjuge(rodolfo);
        wilma.adicionarFilho(new Pessoa("Ricardo"));
        wilma.adicionarFilho(new Pessoa("Rodrigo"));

        Pessoa ricardo = wilma.filhos.get(0);
        Pessoa debora = new Pessoa("Debora");
        ricardo.adicionarConjuge(debora);

        Pessoa sigrid = opa.filhos.get(2);
        Pessoa peter = new Pessoa("Peter");
        sigrid.adicionarConjuge(peter);
        sigrid.adicionarFilho(new Pessoa("Martin"));
        sigrid.adicionarFilho(new Pessoa("Thomas"));
        sigrid.adicionarFilho(new Pessoa("Claudia"));

        Pessoa martin = sigrid.filhos.get(0);
        Pessoa carla = new Pessoa("Carla");
        martin.adicionarConjuge(carla);
        martin.adicionarFilho(new Pessoa("Nicolas"));

        lily.imprimirArvoreGenealogica(0);
    }
}
