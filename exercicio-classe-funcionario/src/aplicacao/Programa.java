package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.println("INFORME OS DADOS DO FUNCION�RIO");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Sal�rio bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println();
		System.out.println(funcionario);
		System.out.println();

		System.out.print("Qual � a taxa do imposto para aumentar o sal�rio? ");
		funcionario.acrescentarValorImposto(sc.nextInt());

		System.out.println();
		System.out.println(funcionario);
		System.out.println();
		
		sc.close();
	}
}
