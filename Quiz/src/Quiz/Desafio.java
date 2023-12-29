import java.util.ArrayList;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");

        String nome = sc.next();
        System.out.println("Bem-vindo ao nosso quiz, " + nome + "!");

        ArrayList<Questao> quiz = new ArrayList<>();

        quiz.add(new Questao("Qual é o capital da França", "Paris"));
        quiz.add(new Questao("Qual é a moeda do Haiti", "Gourde"));
        quiz.add(new Questao("Qual é o nome da maior ponte do mundo", "Ponte Danyang–Kunshan"));
        quiz.add(new Questao("Quantos quilômetros tem a maior do mundo", "164.8"));
        quiz.add(new Questao("Qual é a primeira língua do Haiti", "Francês"));

        int corretas = 0;
        int incorretas = 0;

        for (Questao questao : quiz) {
            System.out.println(questao.getPergunta());

            System.out.print("Sua resposta: ");
            String respostaUsuario = sc.next();

            if (respostaUsuario.equalsIgnoreCase(questao.getResposta())) {
                System.out.println("Correto!");
                corretas++;
            } else {
                System.out.println("Incorreto. A resposta correta é: " + questao.getResposta());
                incorretas++;
            }
        }

        System.out.println("\nResultado final:");
        System.out.println("Perguntas corretas: " + corretas);
        System.out.println("Perguntas incorretas: " + incorretas);

        sc.close();
    }
}
