package aplicacao;

import entidades.Circulo;
import entidades.Quadrado;
import entidades.Retangulo;

public class Programa {
	public static void main(String[] args) {

		Quadrado q = new Quadrado(2.0, 2.0);
		Retangulo r = new Retangulo(4.0, 2.0);
		Circulo c = new Circulo(3.0);

		System.out.println("Área do Quadrado: " + q.calcularArea());
		System.out.println("Área do Retângulo: " + r.calcularArea());
		System.out.println("Área do Círculo: " + c.calcularArea());

	}
}