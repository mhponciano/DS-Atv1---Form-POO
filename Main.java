package encapsulamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;
        boolean rodando = true;

        while {
            System.out.println("\n1. Cadastrar\n2. Editar\n3. Apresentar\n4. Excluir\n5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch {
                case 1:
                    if (pessoa != null) {
                        System.out.println("Cadastro já existente. Edite ou exclua antes de criar um novo.");
                    } else {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("E-mail: ");
                        String email = scanner.nextLine();

                        pessoa = new Pessoas;
                        System.out.println("Cadastro realizado!");
                    }
                    break;
                case 2:
                    if (pessoa == null) {
                        System.out.println("Nenhum cadastro encontrado.");
                    } else {
                        System.out.print("Novo nome: ");
                        pessoa.setNome(scanner.nextLine());
                        System.out.print("Nova idade: ");
                        pessoa.setIdade(scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Novo e-mail: ");
                        pessoa.setEmail(scanner.nextLine());

                        System.out.println("Cadastro atualizado!");
                    }
                    break;
                case 3:
                    if (pessoa == null) {
                        System.out.println("Nenhum cadastro encontrado.");
                    } else {
                        pessoa.apresentar();
                    }
                    break;
                case 4:
                    if (pessoa == null) {
                        System.out.println("Nenhum cadastro encontrado.");
                    } else {
                        pessoa = null;
                        System.out.println("Cadastro excluído!");
                    }
                    break;
                case 5:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
