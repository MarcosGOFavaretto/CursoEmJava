package aplicacao;

import java.util.Scanner;

import utilidades.Conversor;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cotacaoAtual, quantidadeDolares;

		System.out.print("Qual é o preço atual do dólar? ");
		cotacaoAtual = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		quantidadeDolares = sc.nextDouble();

		System.out.println();
		System.out.println("Quantidade a ser paga em reais = "
				+ Conversor.calcularPrecoTotalEmReais(cotacaoAtual, quantidadeDolares));

		sc.close();
	}

}
