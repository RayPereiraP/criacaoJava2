package Dia6;

import java.util.Scanner;
import java.util.Stack;

public class Pilhasss {
    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1: Adicionar um novo livro");
            System.out.println("2: Listar os livros na pilha");
            System.out.println("3: Retirar o último livro");
            System.out.println("0: Sair do programa");
            System.out.print("Escolha uma opção por favor: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    scanner.nextLine(); // Limpar o buffer
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("Opa, esse livro foi adicionado à pilha.");
                    break;
                case 2:
                    System.out.println("Livros na pilha no momento:");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    break;
                case 3:
                    if (!pilhaLivros.isEmpty()) {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro retirado: " + livroRetirado);
                    } else {
                        System.out.println("A pilha no momento está vazia.");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Ops, opção inválida. Tente novamente por gentileza.");
            }
            System.out.println();
        }
    }
}
