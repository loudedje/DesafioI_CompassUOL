package Login;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> usuariosSenhas = new HashMap<>();
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome : ");
        String novoUsuario = ler.nextLine();

        System.out.print("Digite a senha : ");
        String novaSenha = ler.nextLine();

        cadastrarUsuario(usuariosSenhas, novoUsuario, novaSenha);

        System.out.print("Digite o nome de usuário: ");
        String usuario = ler.nextLine();

        System.out.print("Digite a Senha: ");
        String senha = ler.nextLine();

        realizarLogin(usuariosSenhas, usuario, senha);
    }

    private static void cadastrarUsuario(Map<String, String> usuariosSenhas, String usuario, String senha) {
        if (usuariosSenhas.containsKey(usuario)) {
            System.out.println("Usuário já existe. Escolha outro nome de usuário.");
        } else {
            usuariosSenhas.put(usuario, senha);
            System.out.println("Cadastro realizado com sucesso!");
        }
    }

    private static void realizarLogin(Map<String, String> usuariosSenhas, String usuario, String senha) {
        LocalTime d1 = LocalTime.now();

        if (usuariosSenhas.containsKey(usuario) && usuariosSenhas.get(usuario).equals(senha)) {
            if (d1.isAfter(LocalTime.of(6, 0)) && d1.isBefore(LocalTime.of(12, 0))) {
                System.out.println("Bom dia, você se logou ao nosso sistema");
            } else if (d1.isAfter(LocalTime.of(12, 0)) && d1.isBefore(LocalTime.of(18, 0))) {
                System.out.println("Boa tarde, você se logou ao nosso sistema");
            } else if (d1.isAfter(LocalTime.of(18, 0)) && d1.isBefore(LocalTime.of(24, 0))) {
                System.out.println("Boa noite, você se logou ao nosso sistema");
            } else if (d1.isAfter(LocalTime.of(0, 0)) && d1.isBefore(LocalTime.of(6, 0))) {
                System.out.println("Boa madrugada, você se logou ao nosso sistema");
            }
        } else {
            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }
    }

    
   
    
    
}

class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
