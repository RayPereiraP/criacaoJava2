package Dia2;

import java.util.Scanner;

public class Valores {
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Por favor digite um número: ");
		num1 = leia.nextInt();
		
		System.out.println("Por favor mais um número: ");
		num2 = leia.nextInt();
		
		System.out.println("E mais um número: ");
		num3 = leia.nextInt();
		
		if (num1 + num2 > num3) {
            System.out.println("A soma desses dois números é maior que " + num3);
        } else if (num1 + num2 < num3) {
            System.out.println("Mas nesse caso a soma desses dois números é menor que " + num3);
        } else {
            System.out.println("E nesse caso a  soma desses dois números é igual a " + num3);
		}
	}
}