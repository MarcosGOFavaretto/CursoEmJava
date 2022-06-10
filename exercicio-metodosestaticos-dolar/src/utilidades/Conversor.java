package utilidades;

public class Conversor {
	public static double calcularPrecoTotalEmReais(double cotacaoAtual, double quantidadeDolares) {
		double resultado = (cotacaoAtual + (0.6 * cotacaoAtual)) * quantidadeDolares;
		return resultado;
	}
}
