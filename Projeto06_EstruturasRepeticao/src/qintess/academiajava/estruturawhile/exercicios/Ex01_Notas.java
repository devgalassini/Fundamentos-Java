package qintess.academiajava.estruturawhile.exercicios;

import javax.swing.JOptionPane;

public class Ex01_Notas {
	public static void main(String[] args) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos na turma?"));
		double maior = 0, menor = 0, media, soma = 0;

		for (int i = 0; i < quantidade; i++) {
			double nota;
			do {
				nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno " + (i + 1) + ": "));
			} while (nota < 0 || nota > 10);

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
		String resposta = "Maior nota: " + maior + "\nMenor nota: " + menor + "\nM�dia: " + media;
		JOptionPane.showMessageDialog(null, resposta);
	}

}