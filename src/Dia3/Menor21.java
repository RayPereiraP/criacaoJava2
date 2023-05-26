package Dia3;
// atividade de while - exercício 3

import java.util.Scanner;

public class Menor21 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade, menor21 = 0, maior50 = 0;

        while (true) {
            System.out.print("Digite -1 para parar de inserir! \n "
            		+ "Digite uma idade por favor: ");
            idade = leia.nextInt();
            
            if (idade < 21) {
                menor21++;
            } else if (idade > 50) {
                maior50++;
            }

            if (idade < 0) {
                break;
            }
        }

        System.out.println("Esse é o total de pessoas com menos de 21 anos: " + menor21);
        System.out.println("E esse é o total de pessoas com mais de 50 anos: " + maior50);
    }
}

