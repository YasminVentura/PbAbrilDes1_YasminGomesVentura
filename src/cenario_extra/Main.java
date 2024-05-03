package cenario_extra;

import cenario_extra.entidades.Emoji;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a mensagem: ");
        String mensagem = sc.nextLine();

        Emoji emoji = new Emoji();
        String sentimento = emoji.sentimentos(mensagem);

        System.out.println(sentimento);

        sc.close();
    }
}