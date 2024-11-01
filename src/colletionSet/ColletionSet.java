package colletionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColletionSet {
    
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<>();

        // Solicite ao usuário que digite 10 números
		
		System.out.println("Digite 10 números inteiros únicos: ");
		for (int i = 0; i < 10; i++) {
			System.out.print("Número " + (i+1) + ": ");
            int numero = teclado.nextInt();
            numeros.add(numero);
        }
		
		// Mostre os elementos do Set usando Iterator
		
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
        	System.out.println(iterator.next());
        }

        teclado.close();

	}

}
