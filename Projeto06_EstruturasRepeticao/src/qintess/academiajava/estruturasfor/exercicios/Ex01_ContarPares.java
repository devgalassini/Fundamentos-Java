package qintess.academiajava.estruturasfor.exercicios;

import javax.swing.JOptionPane;

public class Ex01_ContarPares {
	public static void main(String[] args) {
		/**
		 * 
		 * Neste programa o usuário escolhe um valor minimo e um valor 
		 * maximo. O programa apresenta a quantidade de numeros pares
		 * existentes entre o minimo e o maximo informados.
		 **/
		int minimo = Integer.parseInt(JOptionPane.showInputDialog("Valor minímo: "));
		int maximo = Integer.parseInt(JOptionPane.showInputDialog("Valor máximo: "));
		
		//Validando se o minimo e menor que o maximo 
		if(minimo >= maximo) {
			JOptionPane.showMessageDialog(null, "O Valor maximo deve ser maior queo minimo ");
			return;
		}
		int quantidade = 0; //variavel que representa a qtde de numeros pares 
		
		for (int i = minimo; i < maximo; i++) {
			if(i % 2 == 0) {
		 }
	  }
		//gerando a resposta 
		String resposta = " Entre " + minimo + " e " + maximo + " existem " + quantidade + " numeros pares ";
		JOptionPane.showMessageDialog(null, resposta);
   }
}