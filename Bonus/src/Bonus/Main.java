package Bonus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int quantidadeFuncionario = 0;
        while (quantidadeFuncionario <= 0) {
            System.out.print("Entre a quantidade de funcionários: ");
            quantidadeFuncionario = ler.nextInt();
            ler.nextLine();
        }

        Funcionario[] funcionarios = new Funcionario[quantidadeFuncionario];
        for (int i = 0; i < quantidadeFuncionario; i++) {
            System.out.println("Entre o nome do funcionário: ");
            String nome = ler.nextLine();
            System.out.println("Entre o salário do Funcionário: ");
            double salario = ler.nextDouble();
            ler.nextLine();

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

            System.out.println("Salário Líquido: " + (funcionario.getSalario() + bonificacao - desconto));
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
