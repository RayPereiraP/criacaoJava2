package Dia6;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Queueio {
	public static void main(String[] args) {
		Queue<String> clientes = new ArrayDeque<>();
		Scanner scanner = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao != 0) {
			System.out.println("Menu:");
			System.out.println("1: Para adicionar novo cliente");
			System.out.println("2: Para listar clientes na fila");
			System.out.println("3: Para chamar próximo cliente");
			System.out.println("0: E para sair do programa");
			System.out.print("Escolha uma opção por favor: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.print("Digite por gentileza o nome do cliente: ");
				scanner.nextLine(); // Limpa o buffer
				String nomeCliente = scanner.nextLine();
				clientes.offer(nomeCliente);
				System.out.println("Cliente adicionado à fila com sucesso.");
				break;
			case 2:
				System.out.println("Clientes presentes na fila:");
	            for (String cliente : clientes) {
	            	System.out.println(cliente);
	            	}
	            break;
	         case 3:
	        	 if (!clientes.isEmpty()) {
	        		 String proximoCliente = clientes.poll();
	                 System.out.println("Cliente chamado: " + proximoCliente);
	                 } else {
	                	 System.out.println("A fila no momento está vazia.");
	                	 }
	        	 break;
	         case 0:
	        	 System.out.println("Programa finalizado!");
	        	 break;
	        	 default:
	        		 System.out.println("Opsss, opção inválida. Tente novamente tente novamente.");
	        		 }
			System.out.println();
			}
	    }
	}