package projectArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadeCores {
	
	public static void main(String[] args) {
		Scanner ordenar = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		// Solicite ao usuário que digite 5 cores
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Digite a cor número " + (i+1) + ": ");
			String cor = ordenar.nextLine();
			cores.add(cor);
		        }
		
		// Mostre as cores na ordem de inserção
		
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
			
		}
		
		// Ordenar as cores e exibir resultado
		
		Collections.sort(cores);
		
		System.out.println("\nCores ordenadas: ");
		for (String cor : cores) {
			System.out.println(cor);
		        }
		
		ordenar.close();

	}

}
