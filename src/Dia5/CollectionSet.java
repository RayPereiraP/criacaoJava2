package Dia5;
//exercício 3 - collection set - único diferente

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;


public class CollectionSet {
	public static void main(String[] args) {
	   Set<Integer> numeros = new HashSet<>(); // Criação da coleção Set
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Digite por favor 10 valores inteiros não repetidos:");
	        for (int cont = 0; cont < 10; cont++) {
	        	int numero = scanner.nextInt(); 
	            
	            if (numeros.contains(numero)) {
	                System.out.println("Opsss!!! Esse número está sendo repetido! Digite outro número por favor: ");
	                cont--; // Aqui ele volta caso o número seja repetido
	                continue; 
	            }
	            
	            numeros.add(numero); // Coloca os números no Set
	        }
	        
	        System.out.println("Elementos da Collection Set:");
	        Iterator<Integer> iterator = numeros.iterator(); // Criação do objeto Iterator
	        while (iterator.hasNext()) {
	            int elemento = iterator.next(); // Pega o próximo elemento da coleção
	            System.out.println(elemento);
	        }
	    }
	}