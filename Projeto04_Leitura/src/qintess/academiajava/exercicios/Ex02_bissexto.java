package qintess.academiajava.exercicios;
import javax.swing.JOptionPane;
 
public class Ex02_bissexto {
  public static void main(String[] args) {
	/*
	 O programa solicita o ano para o usuario.
	 Com base no ano informado, apresentar na tela se este ano � ou n�o bissexto.
	 
	 Obs:. Para o ano ser bissexto, ele deve ser divisivel por 4
	 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano: "));
		
		//Resposta 1:
		String resposta = ano % 4 == 0 ? "O ano � bissexto" : "O ano � bissexto";
		System.out.println(resposta);
		
		//Resposta 2:
		System.out.println(ano % 4 == 0 ? "O ano � bissexto" : "O ano � bissexto");
   }
}