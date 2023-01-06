package entidades;

public class PessoaFisica extends Pessoa {

	private final double CINQUENTA_POR_CENTO = 0.50;
	private final double VINTE_E_CINCO_POR_CENTO = 0.25;
	private final double QUINZE_POR_CENTO = 0.15;

	private double gastosSaude;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.setGastosSaude(gastosSaude);
	}

	public double getGastosSaude() {
		return this.gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {
		double taxa = QUINZE_POR_CENTO;

		if (getRendaAnual() >= 20000.00) {
			taxa = VINTE_E_CINCO_POR_CENTO;
		}

		return (getRendaAnual() * taxa) - (getGastosSaude() * CINQUENTA_POR_CENTO);
	}

}
