package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.println("INFORME OS DADOS DO FUNCIONÁRIO");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println();
		System.out.println(funcionario);
		System.out.println();

		System.out.print("Qual é a taxa do imposto para aumentar o salário? ");
		funcionario.acrescentarValorImposto(sc.nextInt());

		System.out.println();
		System.out.println(funcionario);
		System.out.println();
		
		sc.close();
	}
}
