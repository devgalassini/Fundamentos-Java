package qintess.academiajava.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	public static void main(String[] args) {
		/*
		 * O usuario  fornece uma certa quantidade de numeros .O numero sera mostrado
		 * na tela somente de for positivo.
		 * Se o usuario informar zero, a estrutura termina.
		 */
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
			if(numero == 0) {
				break;
			}
			if(numero < 0) {
				continue;
			}
			System.out.println(numero);
		}
		System.out.println("----------FIM DO PROGRAMA----------------");
	}


}

