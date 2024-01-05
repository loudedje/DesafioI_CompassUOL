package application;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Gerenreciar.Produto;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Produto> estoque = new HashMap<>();

        int opcao;

        do {
            System.out.println("---------------------Welcome--------------------");
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Atualizar Estoque");
            System.out.println("3. Atualizar Quantidade Vendida");
            System.out.println("4. Atualizar Quantidade Comprada");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto(estoque, scanner);
                    break;
                case 2:
                    atualizarQuantidadeVendida(estoque, scanner);
                    break;
                case 3:
                    atualizarProdutoComprado(estoque, scanner);
                    break;
                case 4:
                    System.out.println("Saindo do Programa. Bye!");
                    break;
                default:
                    System.out.println("Opção Inválida. Tente Novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }

    private static void cadastrarProduto(Map<String, Produto> estoque, Scanner scanner) {
        System.out.print("Nome do Produto: ");
        String nome = scanner.next();
        System.out.print("Entrar o id do Produto: ");
        String id = scanner.next();
        System.out.print("Quantidade Inicial em Estoque: ");
        int quantidade = scanner.nextInt();
        System.out.print("O preço do Produto: ");
        Double preco = scanner.nextDouble();
        estoque.put(nome, new Produto(nome, id, preco, quantidade));
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void atualizarEstoque(Map<String, Produto> estoque, Scanner scanner) {
        System.out.print("Nome do Produto: ");
        String nomeAtualizar = scanner.next();
        System.out.print("Quantidade para Atualizar: ");
        int quantidadeAtualizar = scanner.nextInt();
        Produto produtoEstoque = estoque.get(nomeAtualizar);
        if (produtoEstoque != null) {
            produtoEstoque.updateProdutoComprado(quantidadeAtualizar);
            System.out.println("Estoque atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void atualizarQuantidadeVendida(Map<String, Produto> estoque, Scanner scanner) {
        System.out.print("Nome do Produto: ");
        String nomeVenda = scanner.next();
        Produto produtoVenda = estoque.get(nomeVenda);
        if (produtoVenda != null) {
            System.out.print("Quantidade Vendida: ");
            int quantidadeVendida = scanner.nextInt();

            if (quantidadeVendida > 0 && quantidadeVendida <= produtoVenda.getQuantidadeEstoque()) {
                produtoVenda.updateProdutoVendido(quantidadeVendida);
                System.out.println("Quantidade vendida atualizada com sucesso!");
            } else if (quantidadeVendida <= 0) {
                System.out.println("A quantidade deve ser maior que zero");
            } else {
                System.out.println("Produto insuficiente. Estoque atual: " + produtoVenda.getQuantidadeEstoque());
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void atualizarProdutoComprado(Map<String, Produto> estoque, Scanner scanner) {
        System.out.print("Nome do Produto: ");
        String nomeProdutoComprado = scanner.next();
        Produto produtoComprado = estoque.get(nomeProdutoComprado);

        if (produtoComprado != null) {
            System.out.print("Quantidade Comprada: ");
            int quantidadeComprada = scanner.nextInt();

            if (quantidadeComprada > 0) {
                produtoComprado.updateProdutoComprado(quantidadeComprada);
                System.out.println("Quantidade comprada atualizada com sucesso!");
            } else {
                System.out.println("A quantidade deve ser maior que zero");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}


