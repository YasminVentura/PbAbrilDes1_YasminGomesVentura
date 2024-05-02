package cenario2;

import cenario2.entidades.Adulto;
import cenario2.entidades.Crianca;
import cenario2.entidades.RodaGigante;

public class Principal {
    public static void main(String[] args) {
        RodaGigante rodaGigante = new RodaGigante();

        Adulto paulo = new Adulto("Paulo", 42);
        Crianca joao = new Crianca("João", 5, paulo);
        Crianca maria = new Crianca("Maria", 12, paulo);
        Crianca pedro = new Crianca("Pedro", 13);
        Crianca henrique = new Crianca("Henrique", 10);

        rodaGigante.embarcar(2, joao, maria);
        rodaGigante.embarcar(2, joao, paulo);
        rodaGigante.embarcar(3, maria);
        rodaGigante.embarcar(13, pedro);
        rodaGigante.embarcar(16, henrique);

        rodaGigante.status();
    }
}