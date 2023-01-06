package entidades;

public class PessoaJuridica extends Pessoa {

	private final double DEZESSEIS_POR_CENTO = 0.16;
	private final double CATORZE_POR_CENTO = 0.14;

	private int numeroFuncionarios;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.setNumeroFuncionarios(numeroFuncionarios);
	}

	public int getNumeroFuncionario() {
		return this.numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double calcularImposto() {
		double taxa = DEZESSEIS_POR_CENTO;

		if (numeroFuncionarios > 10) {
			taxa = CATORZE_POR_CENTO;
		}

		return getRendaAnual() * taxa;
	}

}
