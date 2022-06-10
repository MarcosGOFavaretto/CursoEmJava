package entidades;

public class Aluno {
	private static double NOTA_MINIMA_PARA_APROVACAO = 60.00;

	public String nome;
	public double notaPrimeiroTrimestre;
	public double notaSegundoTrimestre;
	public double notaTerceiroTrimestre;
	private double somaDasNotas;

	public void somarNotas() {
		somaDasNotas = notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("NOTA FINAL: " + String.format("%.2f", somaDasNotas) + "\n");
		
		if (somaDasNotas >= NOTA_MINIMA_PARA_APROVACAO) {
			sb.append("PASSOU!");
		} else {
			sb.append("REPROVOU!\n");
			sb.append("Faltaram " + String.format("%.2f", NOTA_MINIMA_PARA_APROVACAO - somaDasNotas) + " ponto(s)");
		}

		return sb.toString();
	}
}
