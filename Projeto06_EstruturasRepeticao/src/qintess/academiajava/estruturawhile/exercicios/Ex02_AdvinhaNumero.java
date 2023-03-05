package qintess.academiajava.estruturawhile.exercicios;

import javax.swing.JOptionPane;

public class Ex02_AdvinhaNumero {
	/*
	 * O programa deve gerar um numero aleatorio entre 0 e 100. Em um processo
	 * repetitivo, o usuário tenta adivinhar o numero. Quando o usuário acertar, o
	 * programa mostra o numero de tentativas.
	 */
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);
		int numero, contador = 0;
		String resposta;
		System.out.println(aleatorio);
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Qual número estou pensando?"));
			if (numero < aleatorio) {
				resposta = "O meu número é maior! \nTente novamente.";
				JOptionPane.showMessageDialog(null, resposta);
			} else if (numero > aleatorio) {
				resposta = "O meu número é menor! \nTente novamente.";
				JOptionPane.showMessageDialog(null, resposta);
			}
			contador++;

		} while (numero != aleatorio);
		resposta = "Parabéns!!! \nVocê acertou em " + contador + " tentativas! =)";
		JOptionPane.showMessageDialog(null, resposta);
	}
}