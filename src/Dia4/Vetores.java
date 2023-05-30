package Dia4;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite um número inteiro por favor: ");
            vetor[contador] = scanner.nextInt();
        }

        // Nos mostra os índices ímpares
        System.out.println("Esses são nossos índices ímpares:");
        for (int contador = 1; contador < vetor.length; contador += 2) {
            System.out.println(vetor[contador]);
        }

        // E aqui os pares
        System.out.println("E esses os nossos pares:");
        for (int contador = 0; contador < vetor.length; contador++) {
            if (vetor[contador] % 2 == 0) {
                System.out.println(vetor[contador]);
            }
        }

        // soma e média 
        int soma = 0;
        for (int contador = 0; contador < vetor.length; contador++) {
            soma += vetor[contador]; //soma = soma + vetor[contador];
        }
        double media = (double) soma / vetor.length;

        // Mostrando a soma e a média dos elementos
        System.out.println("Soma dos elementos é: " + soma);
        System.out.println("E a média dos elementos: " + media);

        scanner.close();
    }
}
