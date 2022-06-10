package entidades;

public class Estudantes {

	private String nome;
	private String email;
	private int quarto;

	public Estudantes(String nome, String email, int quarto) {
		this.nome = nome;
		this.email = email;
		this.quarto = quarto;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return this.quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

}