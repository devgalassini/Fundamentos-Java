package qintess.academiajava.estruturawhile.exercicios;

import javax.swing.JOptionPane;

public class Ex02_AdvinhaNumero {
	/*
	 * O programa deve gerar um numero aleatorio entre 0 e 100. Em um processo
	 * repetitivo, o usu�rio tenta adivinhar o numero. Quando o usu�rio acertar, o
	 * programa mostra o numero de tentativas.
	 */
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 100);
		int numero, contador = 0;
		String resposta;
		System.out.println(aleatorio);
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Qual n�mero estou pensando?"));
			if (numero < aleatorio) {
				resposta = "O meu n�mero � maior! \nTente novamente.";
				JOptionPane.showMessageDialog(null, resposta);
			} else if (numero > aleatorio) {
				resposta = "O meu n�mero � menor! \nTente novamente.";
				JOptionPane.showMessageDialog(null, resposta);
			}
			contador++;

		} while (numero != aleatorio);
		resposta = "Parab�ns!!! \nVoc� acertou em " + contador + " tentativas! =)";
		JOptionPane.showMessageDialog(null, resposta);
	}
}