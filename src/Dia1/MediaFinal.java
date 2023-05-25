package Dia1;

import java.util.Scanner;

public class MediaFinal {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, notaMedia;
		
		System.out.println("Digite por favor sua primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite por favor sua segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite por favor sua terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite por favor sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		notaMedia = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("Sua nota média é: " + notaMedia + ", meus parabéns!");
	}
}
