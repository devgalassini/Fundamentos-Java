package qintess.academiajava.classes;

import java.util.Random;

public class Curso {
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;

	public Curso(int codigo, String descricao, int ch, double preco) {

		Random random = new Random();
		this.codigo = random.nextInt(100, 900);

		this.setDescricao(descricao);
		this.setCh(ch);
		this.setPreco(preco);

	}

	public int getCodigo() {
		return codigo;
	}
//
//	public void setCodigo(int codigo) {
//		this.codigo = codigo;
//	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String mostrar() {
		String resposta = "C?digo: " + this.getCodigo() + "\nDescri??o: " + this.getDescricao() + "\nCarga hor?ria: "
				+ this.getCh() + "\nPre?o: " + this.getPreco();
		return resposta;
	}
}