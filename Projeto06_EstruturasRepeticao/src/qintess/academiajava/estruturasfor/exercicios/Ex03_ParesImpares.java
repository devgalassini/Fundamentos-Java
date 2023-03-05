package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex03_ParesImpares {
	/*
	 * Neste exerc�cio o usu�rio informa uma quantidade de n�meros. 
	 * Em Seguida ele digita esses n�meros 
	 * (se for informado 10 n�meros, o usu�rio deve fornecer valor para cada um dos 10 n�meros).
	 * Na medida em que os n�meros forem digitados, o programa deve: 
	 * - contar a quantidade de n�meros pares;
	 * - contar a quantidade de n�meros impares;
	 * - apresentar a porcentagem de n�meros pares em rela��o aos �mpares.
	 */
	public static void main(String[] args) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de n�meros: "));
		@SuppressWarnings("unused")
		int pares = 0, impares = 0;
		
		for (int i = 0; i < quantidade; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero " + (i+1) + ":"));
			
			if(numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		double porcentagem = pares / (double)quantidade * 100; 
		//faz-se o typecast para double, porque os dois valores s�o do tipo int e o resultado da divis�o daria um int
		//por�m, o c�lculo de porcentagem nem sempre � um n�mero inteiro.
		JOptionPane.showMessageDialog(null, "Temos " + porcentagem + "% de n�meros pares");
	}
}