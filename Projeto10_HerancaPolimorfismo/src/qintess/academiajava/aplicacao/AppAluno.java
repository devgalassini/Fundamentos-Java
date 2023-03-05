package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;

public class AppAluno {
	public static void main(String[] args) {
		
		Curso curso = new Curso(2020, "Presencial", 100, 1200);
		
		
		// Definindo o objeto Aluno
		Aluno aluno1 = new Aluno("Priscila", 1234);
		JOptionPane.showMessageDialog(null, aluno1.mostrar());
		
		Aluno aluno2 = new Aluno("Galassini", 3361, curso);
		JOptionPane.showMessageDialog(null, aluno2.mostrar());
		
		Aluno aluno3 = new Aluno("Ana Maria", 2215, new Curso(999, "Ciencia da Computacação ", 4000, 500));
		JOptionPane.showMessageDialog(null, aluno3.mostrar());
		
	}

}
