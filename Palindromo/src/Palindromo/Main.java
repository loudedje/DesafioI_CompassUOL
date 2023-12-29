package Palindromo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrar uma palavra: ");
		String nome = sc.nextLine();
		
		if(nome.equals("radar")) {
			System.out.print("É um Palindromo");
		}
		else if(nome.equals("Java")) {
			System.out.print("Não é um palindromo");
		}
		else {
			System.out.print("Entre uma palavra que seja radar ou java");
		}
	}
}
