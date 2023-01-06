package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();

		for (int i = 1; i <= taxPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			sc.nextLine();
			char peopleType = sc.nextLine().charAt(0);

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (peopleType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				pessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				pessoas.add(new PessoaJuridica(name, anualIncome, numberEmployees));
			}
		}

		System.out.println();
		double totalTaxes = 0.0;
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", pessoa.calcularImposto()));
			totalTaxes += pessoa.calcularImposto();
		}

		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

		sc.close();
	}

}
