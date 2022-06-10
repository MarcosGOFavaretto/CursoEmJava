package entidades;

public class Funcionario {
	private static int FATOR_DE_DIVISIBILIDADE_PORCENTAGEM = 100;

	public String nome;
	public double salarioBruto;
	public double imposto;

	public void acrescentarValorImposto(double imposto) {
		salarioBruto += salarioBruto * (imposto / FATOR_DE_DIVISIBILIDADE_PORCENTAGEM);
	}

	public String toString() {
		return "Nome do Funcionário: " + nome + "\t Salario bruto: $" + String.format("%.2f", salarioBruto - imposto);
	}
}
