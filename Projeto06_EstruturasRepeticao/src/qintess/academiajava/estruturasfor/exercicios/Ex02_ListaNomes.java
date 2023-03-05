package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex02_ListaNomes {
	public static void main(String[] args) {
		/*
		 * O usuario informa uma quantidade de nomes .
		 * De acordo com a quantidade informada o usuario fornece nomes de pessoas para o programa.
		 * 
		 * Na medida em que o usuario fornecer os nomes, o programa mostra na tela 
		 * apenas os nomes tiverem mais que 10 caracteriticas
		 */
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos nomes você deseja? "));
		
		for (int i = 0; i < quantidade; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome " + (i+1) + "/" + quantidade);
			if(nome.length() > 10) {
				System.out.println(nome);
			}
		}
	}

}
