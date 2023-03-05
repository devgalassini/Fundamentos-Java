package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex03_ParesImpares {
	/*
	 * Neste exercício o usuário informa uma quantidade de números. 
	 * Em Seguida ele digita esses números 
	 * (se for informado 10 números, o usuário deve fornecer valor para cada um dos 10 números).
	 * Na medida em que os números forem digitados, o programa deve: 
	 * - contar a quantidade de números pares;
	 * - contar a quantidade de números impares;
	 * - apresentar a porcentagem de números pares em relação aos ímpares.
	 */
	public static void main(String[] args) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números: "));
		@SuppressWarnings("unused")
		int pares = 0, impares = 0;
		
		for (int i = 0; i < quantidade; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + (i+1) + ":"));
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		double porcentagem = pares / (double)quantidade * 100; 
		//faz-se o typecast para double, porque os dois valores são do tipo int e o resultado da divisão daria um int
		//porém, o cálculo de porcentagem nem sempre é um número inteiro.
		JOptionPane.showMessageDialog(null, "Temos " + porcentagem + "% de números pares");
	}
}