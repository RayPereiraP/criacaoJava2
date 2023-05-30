package Dia5;
//exercício 1 - collection set - lista

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite por favor 5 cores: ");

        for (int cont = 0; cont < 5; cont++) {
            System.out.print("Cor " + (cont + 1) + ": ");
            String cor = scanner.nextLine();
            cores.add(cor);
        }

        System.out.println("\nEssas são as cores adicionadas: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Coloca em ordem crescente
        Collections.sort(cores);

        System.out.println("\nE aqui temos as cores adicionadas em ordem crescente: ");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
