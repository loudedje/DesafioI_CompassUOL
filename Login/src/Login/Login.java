package Login;

import java.time.LocalTime;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        LocalTime d1 = LocalTime.now();

        Usuario[] usuarios = new Usuario[10];

        Scanner registerScanner = new Scanner(System.in);
        System.out.println("Digite um nome para o novo usuário: ");
        String Nome = registerScanner.nextLine();

        System.out.println("Digite uma senha para o novo usuário: ");
        String Senha = registerScanner.nextLine();

        Usuario novoUsuario = new Usuario(Nome, Senha);

        // Correção 1: Inicialização do Array de Usuários
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] == null) {
                usuarios[i] = novoUsuario;
                System.out.println("Novo usuário cadastrado com sucesso!");
                break; // Correção 2: Mover o break para dentro do if
            } else {
                System.out.println("Limite de usuários atingido. Não foi possível cadastrar o novo usuário.");
            }
        }

        Scanner loginScanner = new Scanner(System.in);
        System.out.println("Digite o teu nome: ");
        String nomeUsuario = loginScanner.nextLine();

        System.out.println("Digite uma senha: ");
        String senhaUsuario = loginScanner.nextLine();

        Usuario usuario = new Usuario(nomeUsuario, senhaUsuario);

        boolean userExists = false;
        for (Usuario u : usuarios) {
            if (u != null && u.equals(usuario)) {
                userExists = true;
                // Correção 3: Mover a mensagem de boas-vindas para fora do loop
            }
        }

        if (userExists) {
            System.out.println("Bem-vindo");
        } else {
            System.out.println("Usuário não encontrado. Login falhou.");
        }
    }
}
