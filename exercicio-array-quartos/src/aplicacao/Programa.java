package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Estudantes;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int escolha = sc.nextInt();
		System.out.println();
		
		Estudantes[] estudantes = new Estudantes[10];
		
		for (int i = 0; i < escolha; i++) {
			
			sc.nextLine();
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int quarto = sc.nextInt();
			
			estudantes[quarto] = new Estudantes(nome, email, quarto);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < estudantes.length; i++) {
			if (estudantes[i] != null) {
				System.out.println(
						estudantes[i].getQuarto() + ": " + 
						estudantes[i].getNome() + ", " + 
						estudantes[i].getEmail());
			}
		}
		
		sc.close();
	}

}
