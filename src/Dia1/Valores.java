package Dia1;

import java.util.Scanner;

public class Valores {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, dif;
		
		System.out.println("Digite por favor um valor: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite novamente outro valor: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite mais um valor: ");
		n3 = leia.nextFloat();
		
		System.out.println("E só mais um valor por favor: ");
		n4 = leia.nextFloat();
		
		dif = (n1*n2) - (n3*n4);
		System.out.println("A diferença é de: " + dif);
	}
}