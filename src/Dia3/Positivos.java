package Dia3;

import java.util.Scanner;

public class Positivos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, soma = 0;

        do {
            System.out.print("Digite um número inteiro por favor (e digite 0 caso queira sair): ");
            num = leia.nextInt();

            if (num > 0) {
            	soma = soma + num; //num + soma = soma (lembrar)
            }
        } while (num != 0);

        System.out.println("A soma de todos os números positivos é: " + soma);
    }
}
