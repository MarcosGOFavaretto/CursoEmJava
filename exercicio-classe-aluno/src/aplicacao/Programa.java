package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();

		// Recebendo os dados:
		System.out.println("INFORME OS DADOS DO ALUNO");
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Nota do 1° Trimestre: ");
		aluno.notaPrimeiroTrimestre = sc.nextDouble();
		System.out.print("Nota do 2° Trimestre: ");
		aluno.notaSegundoTrimestre = sc.nextDouble();
		System.out.print("Nota do 3° Trimestre: ");
		aluno.notaTerceiroTrimestre = sc.nextDouble();

		// Realizando a soma das notas:
		aluno.somarNotas();
		
		// Imprimindo as informações do aluno:
		System.out.println();
		System.out.println(aluno);
		System.out.println();
		
		sc.close();
	}

}
