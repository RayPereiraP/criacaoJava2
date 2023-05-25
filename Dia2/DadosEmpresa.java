package Dia2;
import java.util.Scanner;

public class DadosEmpresa {
	    public static void main(String[] args) 
	    {
	    	Scanner leia = new Scanner(System.in);
	        String colaborador;
	        int cargo;
	        float salario, reajuste, novoSalario;

	        System.out.println("Digite por favor o nome e sobrenome do colaborador: ");
	        colaborador = leia.nextLine();

	        System.out.println("Digite o número do cargo (escolha de 1 a 6, "
	        		+ "lembrando que: 1 - Gerente, 2 - Vendedor, "
	        		+ "3 - Supervisor, 4 - Motorista, 5 - Estoquista"
	        		+ " e 6 - Técnico de TI): ");
	        cargo = leia.nextInt();

	        System.out.println("Digite o salário atual desse mesmo colaborador: ");
	        salario = leia.nextFloat();

	        switch (cargo) {
	            case 1:
	                reajuste = 0.1f;
	                System.out.println("Cargo: Gerente");
	                break;
	            case 2:
	                reajuste = 0.07f;
	                System.out.println("Cargo: Vendedor");
	                break;
	            case 3:
	                reajuste = 0.09f;
	                System.out.println("Cargo: Supervisor");
	                break;
	            case 4:
	                reajuste = 0.06f;
	                System.out.println("Cargo: Motorista");
	                break;
	            case 5:
	                reajuste = 0.05f;
	                System.out.println("Cargo: Estoquista");
	                break;
	            case 6:
	                reajuste = 0.08f;
	                System.out.println("Cargo: Técnico de TI");
	                break;
	            default:
	                System.out.println("Código de cargo inválido");
	                return;
	        }

	        novoSalario = salario + (reajuste * salario);
	        System.out.println("Nome do colaborador: " + colaborador);
	        System.out.println("Seu salário agora passa a ser esse valor: " + novoSalario);
	        }
}