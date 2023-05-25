package Dia1;

import java.util.Scanner;

public class SalarioBruto {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, liquido;
		
		System.out.println("Digite por favor o valor de seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite por favor o valor de seu adiconal noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite por favor o valor das suas horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite por favor o valor de seu desconto: ");
		descontos = leia.nextFloat();
		
		liquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.println("O seu salário líquido é: " + liquido);
	}
}