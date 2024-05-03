package cenario_extra.entidades;

public class Emoji {
    public String sentimentos(String mensagem) {
        int divertido = contadorEmojis(mensagem, ":-)");
        int chateado = contadorEmojis(mensagem, ":-(");

        if (divertido > chateado) {
            return "divertido";
        } else if (chateado > divertido) {
            return "chateado";
        } else {
            return "neutro";
        }
    }

    private int contadorEmojis(String mensagem, String emoji) {
        int contador = 0;
        int i = mensagem.indexOf(emoji);
        while (i != -1) {
            contador++;
            i = mensagem.indexOf(emoji, i + 1);
        }
        return contador;
    }
}
