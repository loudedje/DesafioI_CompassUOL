package Palindromo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Entrar uma palavra: ");
            String nome = sc.nextLine().toLowerCase(); // Converter para minúsculas

            if (nome.equals("radar") || nome.equals("radar".toUpperCase())) {
                System.out.println("É um Palíndromo");
            } else if (nome.equals("java") || nome.equals("java".toUpperCase())) {
                System.out.println("Não é um palíndromo");
            } else {
                System.out.println("Entre uma palavra que seja 'radar' ou 'Java'");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir uma palavra seja 'radar' ou 'Java'");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
