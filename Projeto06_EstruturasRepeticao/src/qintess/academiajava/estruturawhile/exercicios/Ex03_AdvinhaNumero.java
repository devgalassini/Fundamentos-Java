/**
 * 
 *  * O programa deve gerar um numero aleatorio entre 0 e 100. Em um processo
		 * repetitivo, o usu�rio tenta adivinhar o numero. Quando o usu�rio acertar, o
		 * programa mostra o numero de tentativas.
		 * 
		 *       Exemplo De execu��o 
		 * 
		 * 1. Conidere que tenha sido gerado o numero 45.
		 * 2. N� primeira itera��o, o programa solicita:
		 * 
		 *    " Informe um numero entre 1 e 100"
		 *    
		 * 3. O Usuario digita: 50 (acima do valor gerado)
		 * 4. Na proxima intera��o, o programa solicita:
		 *     
		 *      " Informe um n�mero entre 1 e 49."
		 *      
		 * 5. O Usuario digita: 20 (acima do valor gerado)
		 * 6. Na proxima intera��o, o programa solicita:
		 * 
		 * 		" Informe um n�mero entre 21 e 49."
		 *     
		 * 7. E assim sucessivamente, at� o usuario acertar.
 */


package qintess.academiajava.estruturawhile.exercicios;

import javax.swing.JOptionPane;

public class Ex03_AdvinhaNumero {
	public static void main(String[] args) {

		
		
		int numero = (int)(Math.random() * 100) + 1; // numero entre 1 e 100
		int maximo = 100, minimo = 1;
		int tentativas = 0;
		
		while(true) {
			tentativas++;
			
			int valor = Integer.parseInt(JOptionPane
					.showInputDialog(" Informe um valor entre " + minimo + " e " + maximo));
			
			if(valor < minimo || valor > maximo) {
				continue;
			}
			if(valor < numero) {
				minimo = valor + 1;
			}else if(valor > numero) {
				maximo = valor - 1;
			}else {
				break;
			}
			
		}
		JOptionPane.showMessageDialog(null, " Voc� acertou em " + tentativas + " tentatvas ");
	}

}









