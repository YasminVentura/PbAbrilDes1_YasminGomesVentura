package cenario2;

import cenario2.entidades.Adulto;
import cenario2.entidades.Crianca;
import cenario2.entidades.RodaGigante;

public class Principal {
    public static void main(String[] args) {
        RodaGigante rodaGigante = new RodaGigante(18);

        Adulto paulo = new Adulto("Paulo", 42);
        Crianca joao = new Crianca("João", 5, paulo);
        Crianca maria = new Crianca("Maria", 12, paulo);
        Crianca pedro = new Crianca("Pedro", 13);
        Crianca henrique = new Crianca("Henrique", 10);

        rodaGigante.embarcar(joao, maria);
        rodaGigante.embarcar(joao, paulo);
        rodaGigante.embarcar(maria);
        rodaGigante.embarcar(pedro);
        rodaGigante.embarcar(henrique);

        rodaGigante.status();
    }
}
