package qintess.academiajava.classes;

public class Aluno {
	private String nome;
	private int matricula;
	private Curso curso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String mostrar() {
		String resposta = "Nome: " + this.getNome() + "\nMatricula: " + this.getMatricula() + "\n\nDADOS DO CURSO\n"
				+ this.getCurso().mostrar();
		return resposta;
	}
}