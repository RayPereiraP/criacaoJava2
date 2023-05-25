package Dia1;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float salarioo;
		float abono;
		float novoSalario;
		
		System.out.println("Digite por favor o valor de seu salário atual: ");
		salarioo = leia.nextFloat();
		
		System.out.println("Agora, por favor digite o valor de seu abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salarioo + abono;
		System.out.println("O seu novo salário é: " + novoSalario);
	}
}