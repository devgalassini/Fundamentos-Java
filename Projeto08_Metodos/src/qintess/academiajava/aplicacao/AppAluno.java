package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;

public class AppAluno {
	public static void main(String[] args) {
		// Definido o objeto curso
		Curso curso = new Curso();
		curso.setCodigo(100);
		curso.setDescricao("Fundamentos do Java");
		curso.setCh(100);
		curso.setPreco(1200);

		// Definindo o objeto Aluno
		Aluno aluno = new Aluno();
		aluno.setNome(" Priscila Galassini");
		aluno.setMatricula(1234);
		aluno.setCurso(curso);

		JOptionPane.showMessageDialog(null, aluno.mostrar());
	}

}
