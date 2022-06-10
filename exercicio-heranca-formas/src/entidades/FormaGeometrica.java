package entidades;

public class FormaGeometrica {
	private Double altura;
	private Double largura;

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getAltura() {
		return this.altura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getLargura() {
		return this.largura;
	}

	public Double calcularArea() {
		return altura * largura;
	}
}