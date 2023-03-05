package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex04_Notas {
	public static void main(String[] args) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos na turma?"));
		double maior = 0, menor = 0, media, soma = 0;

		for (int i = 0; i < quantidade; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + ": "));
			soma += nota;
			if (i == 0) {
				maior = menor = nota;
			} else {
				if (nota < menor) {
					menor = nota;
				}
				if (nota > maior) {
					maior = nota;
				}
			}
		}
		media = soma / quantidade;
		String resposta = "Maior nota: " + maior + 
			"\nMenor nota: " + menor + 
			"\nMédia: " + media;
		JOptionPane.showMessageDialog(null, resposta);
	}		
}