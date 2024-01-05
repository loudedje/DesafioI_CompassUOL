package application;

import Gerenreciar.Produto;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("\n");
            System.out.println("------------------Bem-vindo ao nosso sistema----------------------------\n");
            
            Produto produto1 = new Produto("Arroz", "23", 44.44, 2);
            Produto produto2 = new Produto("Sabão", "11", 33.55, 5);
            
            // Testando com número negativo
            // produto1.updateProdutoComprado(-9);
            
            // Testando com número positivo
            produto1.updateProdutoComprado(2);
            produto2.updateProdutoComprado(5);
            
            produto1.updateProdutoVendido(5);
           
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
