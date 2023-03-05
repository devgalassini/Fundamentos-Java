package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf03 {
	public static void main(String[] args) {
		/**
		 * 
		 * Em um clube, o valor do ingressoo é cobrado de acordo com a idade
		 * da pessoa. As regras são:
		 * 
		 * 
		 * - Ate 17 anos: R$ 50,00 por ingresso
		 * - Entre 18 e 59 anos: R$ 70,00
		 * - A partir de 60 anos: R$ 25,00 
		 * 
		 *  Escreva o programa que solicita a idade e apresenta o valor a ser pago.
		 */	
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));
		double ingresso;
		
		if(idade < 18) {
			ingresso = 50;
		}else if(idade > 59) {
			ingresso = 25;
		}else {
			ingresso = 70;
			
			String resposta = "Idade: " +
			   "\nValor do ingresso: " + ingresso;
			JOptionPane.showMessageDialog(null, resposta);
		}
	}

}
