package qintess.academiajava.leitura;

import javax.swing.JOptionPane;

public class DadosProduto {
  public static void main(String[] args) {
	
	  /*
	   Comentario em bloco ,Nesse programa, perguntaremos o valor dos dados de um produto:
	   
	   - marca ( String)
	   - descrição (String)
	   - categoria ( String)
	   - ano fabricação (int)
	   - preço do produto  (double)
	   - quantidade (double)
	   
	   e com estes dados , calcularemos;
	   
	   - valor total (double)
	   Escrever ese programa, apresentando estes dados em uma caixa de mensagem como resposta
	  */
	  
	  String marca = JOptionPane.showInputDialog("informe a marca: ");
	  String descricao = JOptionPane.showInputDialog("Informe a descrição do produto: ");
	  String categoria = JOptionPane.showInputDialog("Informe a categoria: ");
	  
	  int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de fabricação:"));
	  double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o  preço: "));
	  double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade: "));
	  
	  double total = preco * quantidade;
	  
	  //Gerando a resposta
	  String resposta = "Marca: " + marca + "\nDescrição: " + descricao +
			  "\nCategoria: " + categoria + "\nAno De Fabricação: " + ano +
			  "\nPreço:" + "\nQuantidade: " + quantidade + "\nValor Total:";
	  
	  // imprimindo na tela
	  JOptionPane.showMessageDialog(null, resposta);
  }
}
