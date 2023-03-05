package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.receber("Bicicleta", "Caloi", 999.90);
		System.out.println(produto.mostrar());
		JOptionPane.showMessageDialog(null, produto.mostrar());
		
	}
}