package qintess.academiajava.leitura;

import javax.swing.JOptionPane;

public class LeituraDados {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual � o seu Nome?");
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual � o seu peso? "));
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � a sua idade? "));
		
		//Gerando uma reposta 
		String resposta = "Nome  informado: " + nome +
				"\nPeso " + peso +
				"\nIdade " + idade;
		
		
		//System.out.println("Nome informado: " + nome);
		JOptionPane.showMessageDialog(null, resposta);
		
	}

}
