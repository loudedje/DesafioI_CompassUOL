package emoticon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Entre com uma mensagem: ");
            String mensagem = ler.nextLine();

            int contDivertido = 0;
            int contChateado = 0;

            for (int i = 0; i < mensagem.length() - 2; i++) {
                if (mensagem.charAt(i) == ':' && mensagem.charAt(i + 1) == '-' && mensagem.charAt(i + 2) == ')') {
                    contDivertido++;
                } else if (mensagem.charAt(i) == ':' && mensagem.charAt(i + 1) == '-' && mensagem.charAt(i + 2) == '(') {
                    contChateado++;
                }
            }

            if (contDivertido > contChateado) {
                System.out.println("Divertido");
            } else if (contDivertido < contChateado) {
                System.out.println("Chateado");
            } else {
                System.out.println("Neutro");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir uma mensagem válida.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            if (ler != null) {
                ler.close();
            }
        }
    }
}
