package Dia3;
import java.util.Scanner;
//utilização do for - exercicio 2

public class ParImpar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, par = 0, impar = 0;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.print("Digite a " + contador + "° posição: ");
            num = leia.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.println("Esse é o total de números pares: " + par);
        System.out.println("E esse é de números ímpares: " + impar);
    }
}