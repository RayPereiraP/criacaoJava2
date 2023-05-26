package Dia2;
import java.util.Scanner;

public class Itens {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cod, quan,total;
		String nome = "";
		
		System.out.println("Por favor digite o código de item desejado (Escolha de 1 a 6): ");
		cod = leia.nextInt();
	
		System.out.println("Digite a quantidade comprada por favor: ");
		quan = leia.nextInt();
		
	switch (cod) {
	case 1:
		nome = "Cachorro quente";
		total = quan * 10;
			break;
	case 2:
		nome = "X-salada";
		total = quan * 15;
			break;
	 case 3:
         nome = "X-Bacon";
         total = quan * 18;
         break;
     case 4:
         nome = "Bauru";
         total = quan * 12;
         break;
     case 5:
         nome = "Refrigerante";
         total = quan * 8;
         break;
     case 6:
         nome = "Suco de laranja";
         total = quan * 13;
         break;
     default:
         System.out.println("Opsss! Código inválido... Comece novamente!");
         return;
         }
	System.out.println("O nome do produto selecionado é: " + nome);
	System.out.println("E o valor total da conta é: R$" + total);
	}
}
