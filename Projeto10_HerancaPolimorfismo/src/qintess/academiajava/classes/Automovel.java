package qintess.academiajava.classes;

//1. Atributos
public class Automovel {
	private String marca;
	private String modelo;
	private int ano;

	// 2. contrutores
	public Automovel(String marca) {
		this.setMarca(marca);
		//this.setModelo("Não informado");
		//this.setAno(1960);

	}

	public Automovel(String marca, String modelo) {
		this.setMarca(marca);
		this.setModelo(modelo);
		//this.setAno(1960);
	}

	public Automovel(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}

	// 3.getters e setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano < 1960) {
			throw new NumberFormatException("O ano mínimo é 1960.");
		}
		this.ano = ano;
	}

	public String mostrar() {
		String resposta = "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAno: " + this.getAno();

		return resposta;
	}

	

	}
