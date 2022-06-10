package entidades;

public class Circulo extends FormaGeometrica {
	private Double raio;

	public Circulo(Double raio) {
		this.setRaio(raio);
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return this.raio;
	}

	@Override
	public Double calcularArea() {
		return Math.PI * (getRaio() * getRaio());
	}
}