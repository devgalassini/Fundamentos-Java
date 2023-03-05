package qintess.academiajava.exercicios;

import javax.swing.JOptionPane;

public class Ex01_CaixaEletronico {
	public static void main(String[] args) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:")); // converte a String do Input para double
		int valorSaque = (int)valor; //typecast ou cast (coers�o)
		
		if (valorSaque % 5 != 0) { //verifica se o valor do saque n�o � multiplo de 5
			JOptionPane.showMessageDialog(null, "O valor n�o � multiplo de 5!!! N�o e poss�vel sacar.");
			return; //System.exit(0);
		}
		
		//se chegar aqui, � porqu� o valor � multiplo de 5...
		int quant50, quant20, quant10, quant5;
		//atribui��o simut�nea
		quant50 = quant20 = quant10 = quant5 = 0; 
		
		quant50 = valorSaque / 50;
		valorSaque = valorSaque % 50;
		
		quant20 = valorSaque / 20;
		valorSaque = valorSaque % 20;
		
		quant10 = valorSaque / 10;
		valorSaque = valorSaque % 10;
		
		quant5 = valorSaque / 5;
		
		//resposta
		String resposta = "Valor do saque: R$" + valor + 
				"\nNotas de R$50: " + quant50 +
				"\nNotas de R$20: " + quant20 +
				"\nNotas de R$10: " + quant10 +
				"\nNotas de R$5: " + quant5;
		JOptionPane.showMessageDialog(null, resposta);
	}
}