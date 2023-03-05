package qintess.academiajava.classes;

public class Produto {

	private final int codigo;
	private String categoria;
	private String descricao;
	private double preco;

	private static int CONTADOR = 1;

	// construtor: vamos admitir que todos os atributos do produto devam ser
	// informados.
	public Produto(String descricao, String categoria, double preco) {
		this.codigo = CONTADOR++;
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new NumberFormatException("Preço não pode ser negativo.");
		}
		this.preco = preco;

	}

	// MÉTODOS ADICIONAIS

	public int getCodigo() {
		return codigo;
	}

	public void receber(String descricao, String categoria, double preco) {
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPreco(preco);
	}

	public String mostrar() {
		return "Codigo: " + this.getCodigo() +
				"Descrição: " + this.getDescricao() + 
				"\nCatergoria: " + this.getCategoria() +
				"\nPreço: " + this.getPreco();
	}
}
