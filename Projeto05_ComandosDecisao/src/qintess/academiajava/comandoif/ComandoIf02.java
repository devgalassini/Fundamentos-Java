package qintess.academiajava.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf02 {
	public static void main(String[] args) {
		/*
		 * 
		 * Em uma empresa um funcionario tem um valor desconto do seu salario
		 * somente se o salario for maior que 5.000,00.
		 * 
		 * - Até 5.000,00: nada é descontado de 10% sobre o que passar de 5.000,00
		 * 
		 * Exemplo: Salario de 5.000,00: desconto de 10% sobre 500,00
		 */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu Salario:"));
		double desconto = 0;
		
		if (salario > 5000) {
			desconto = (salario - 5000) * 0.1;
			
		}
		//Contruindo a reposta
		String resposta = "Salario bruto: " + salario +
				"\nDesconto: " + desconto +
				"\nLiquido: " + (salario - desconto);
		
		JOptionPane.showMessageDialog(null, resposta);
 	}

}
