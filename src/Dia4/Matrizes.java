package Dia4;
import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner scanner = new Scanner(System.in);
	        
	    for (int contadorLinha = 0; contadorLinha < matriz.length; contadorLinha++) {
	    	for (int contadorColuna = 0; contadorColuna < matriz[contadorLinha].length; contadorColuna++) {
	                System.out.print("Digite por favor o elemento da posição [" + contadorLinha + "][" + contadorColuna + "]: ");
	                matriz[contadorLinha][contadorColuna] = scanner.nextInt();
	            }
	        }
	        
	    //diagonal principal - mostra
	        System.out.println("\nElementos da Diagonal Principal:");
	        for (int contador = 0; contador < matriz.length; contador++) {
	            System.out.println(matriz[contador][contador]);
	        }
	    //secundária - mostra
	        System.out.println("\nElementos da Diagonal Secundária:");
	        for (int contador = 0; contador < matriz.length; contador++) {
	            System.out.println(matriz[contador][matriz.length - 1 - contador]);
	        }
	        
	     //soma de ambas diagonais   
	        int somaDiagonalPrincipal = 0;
	        int somaDiagonalSecundaria = 0;
	        
	        for (int contador = 0; contador < matriz.length; contador++) {
	            somaDiagonalPrincipal += matriz[contador][contador];
	            somaDiagonalSecundaria += matriz[contador][matriz.length - 1 - contador];
	        }
	        
	        System.out.println("\nA soma dos elementos da Diagonal Principal é: " + somaDiagonalPrincipal);
	        System.out.println("E a soma dos elementos da Diagonal Secundária é de: " + somaDiagonalSecundaria);
	    }
	}