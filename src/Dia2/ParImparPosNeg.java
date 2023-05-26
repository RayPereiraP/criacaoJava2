package Dia2;
import java.util.Scanner;

public class ParImparPosNeg {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.println("Por favor digite um número: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Esse número é par!");
		} else {
			System.out.println("Esse número aqui é ímpar!");
		}
		if (num >= 0) {
			System.out.println("E também um número positivo!");
		} else {
			System.out.println("E esse é negativo!");
		}
	}
}