package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setPessoa(" Priscila De Oliveira Galassini");
		pessoa.setIdade(33);
		pessoa.setSexo(Sexo.FEMININO);
		
		JOptionPane.showMessageDialog(null, pessoa.mostrar());
	}

}
