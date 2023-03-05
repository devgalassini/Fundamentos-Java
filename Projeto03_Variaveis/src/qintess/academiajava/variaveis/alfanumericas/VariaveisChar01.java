package qintess.academiajava.variaveis.alfanumericas;

import javax.swing.JOptionPane;

public class VariaveisChar01 {
	public static void main(String[] args) {
		// char possui 16 bits (32764 caracteres) = tabela Unicode
		char c1 = 'x';
		char c2 = 65;
		char c3 = 27554;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		JOptionPane.showMessageDialog(null, c3);
		
	}

}
