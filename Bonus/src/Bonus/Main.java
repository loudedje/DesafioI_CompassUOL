package Bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
        	
            int quantidadeFuncionario = 0;
            while (quantidadeFuncionario <= 0) {
                System.out.print("Entre com a quantidade de funcionários: ");
                quantidadeFuncionario = ler.nextInt();
                if (quantidadeFuncionario <= 0) {
                    System.out.println("A quantidade de funcionários deve ser maior que zero. Tente novamente.");
                }
            }

            Funcionario[] funcionarios = new Funcionario[quantidadeFuncionario];

            for (int i = 0; i < quantidadeFuncionario; i++) {
                System.out.print("Entre com o nome do funcionário: ");
                String nome = ler.next(); 

                double salario = 0;
                while (salario <= 0) {
                    System.out.print("Entre com o salário do funcionário (deve ser um valor positivo): ");
                    salario = ler.nextDouble();
                    if (salario <= 0) {
                        System.out.println("O salário deve ser um valor positivo. Tente novamente.");
                    }
                }

                funcionarios[i] = new Funcionario(nome, salario);
            }

            double bonificacaoTotal = 0;
            double descontoTotal = 0;

            for (Funcionario funcionario : funcionarios) {
                double bonificacao = 0;
                double desconto = 0;

                if (funcionario.getSalario() <= 1000) {
                    bonificacao = funcionario.getSalario() * 0.2;
                } else if (funcionario.getSalario() > 1000 && funcionario.getSalario() < 2000) {
                    bonificacao = funcionario.getSalario() * 0.1;
                } else {
                    desconto = funcionario.getSalario() * 0.1;
                }

                bonificacaoTotal += bonificacao;
                descontoTotal += desconto;

                double salarioLiquido = funcionario.getSalario() + bonificacao - desconto;
                System.out.println("Salário Líquido de " + funcionario.getNome() + ": " + salarioLiquido);
            }

            // Exibir total de bonificações e descontos
            System.out.println("\nTotal de Bonificações: " + bonificacaoTotal);
            System.out.println("Total de Descontos: " + descontoTotal);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de inserir números corretos.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            
            if (ler != null) {
                ler.close();
            }
        }
    }
}

class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }
}
