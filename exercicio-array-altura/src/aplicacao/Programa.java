package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a quantidade de inserções:");
		int escolha = sc.nextInt();

		double[] altura = new double[escolha];
		double media = 0.0;

		System.out.println("Insira as alturas:");
		
		for (int i = 0; i < escolha; i++)
			altura[i] = sc.nextDouble();

		for (int i = 0; i < altura.length; i++)
			media = media + altura[i];

		media = media / altura.length;

		System.out.printf("AVERAGE HEIGHT: %.2f%n", media);

		sc.close();
	}
}
