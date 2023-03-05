package qintess.academiajava.classes;

import qintess.academiajava.enumeracoes.Sexo;

public class Pessoa {

	private String Pessoa;
	private int idade;
	private Sexo sexo;

	public String getPessoa() {
		return Pessoa;
	}

	public void setPessoa(String pessoa) {
		Pessoa = pessoa;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String mostrar() {
		String resposta = "Nome: " + this.getPessoa() + 
				"\nIdade: " + this.getIdade() + 
				"\nSexo: " + this.getSexo();
		return resposta;
	}
}
