package qintess.academiajava.variaveis.alfanumericas;

import javax.swing.JOptionPane;

public class VariaveisString01 {
	public static void main(String[] args) {
		//dados pessoais
		String nome = " Priscila De Oliveira Galassini";
		int idade = 33;
		double peso = 55.4;
		double altura = 1.58;
		
		//Criando uma variavel para representar um relatorio com dados pessoais
		String resultado ="Dados Pessoais \n\n" +
		    "Nome:" + nome +
		    "\nIdade: " + idade + " anos " +
		    "\nPeso: " + peso + " kg " +
		    "\nAltura: " + altura + " metros ";
		
		System.out.println(resultado);
		JOptionPane.showInputDialog(null, resultado);
		
		
	}

}
