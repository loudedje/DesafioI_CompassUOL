package Quiz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        	System.out.println("-----------------------------------------------------------");
        	System.out.println("---------------QUIZ-------------------------------------");
            System.out.print("Digite o seu nome: ");
            String nome = sc.next();
            System.out.println("Bem-vindo ao nosso quiz, " + nome + "!");

            ArrayList<Questao> quiz = new ArrayList<>();

            quiz.add(new Questao("Qual é o capital da França?", "Paris"));
            quiz.add(new Questao("Qual é a moeda do Haiti?", "Gourde"));
            quiz.add(new Questao("Qual é o nome da maior ponte do mundo?", "Ponte Danyang–Kunshan"));
            quiz.add(new Questao("Quantos quilômetros tem a maior do mundo?", "164.8"));
            quiz.add(new Questao("Qual é a primeira língua do Haiti?", "Crioulo"));
            quiz.add(new Questao("Quem é o autor de 'Dom Quixote'?", "Miguel de Cervantes"));
            quiz.add(new Questao("Em que ano foi assinada a Declaração de Independência dos Estados Unidos?", "1776"));
            quiz.add(new Questao("Qual é o planeta conhecido como o 'Planeta Vermelho'?", "Marte"));

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

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir dados corretos.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}

class Questao {
    private String pergunta;
    private String resposta;

    public Questao(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }
}
