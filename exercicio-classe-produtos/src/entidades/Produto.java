package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalNoEstoque() {
		return 0.0;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return "_______________ INFORMAÇÕES DO PRODUTO _______________" + "\n Nome: " + nome + "\t Preço: R$" + String.format("%.2f", preco) + "\t Estoque: "
				+ quantidade;
	}
}
