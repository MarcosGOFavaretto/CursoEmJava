package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a quantidade de produtos:");
		int escolha = sc.nextInt();
		Produto[] produtos = new Produto[escolha];

		System.out.println("Insira o nome e o preço do produto (separando por Enter):");

		for (int i = 0; i < produtos.length; i++)
			produtos[i] = new Produto(sc.next(), sc.nextDouble());

		double media = 0.0;

		for (int i = 0; i < produtos.length; i++)
			media = media + produtos[i].getPreco();

		media = media / produtos.length;

		System.out.printf("AVERAGE PRICE: %.2f%n", media);
		sc.close();

	}
}
