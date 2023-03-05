package qintess.academiajava.exercicios;

import javax.swing.JOptionPane;

public class Ex01_minutos {
	public static void main(String[] args) {
		/*
		 Neste Exercicio, o usuario foenece uma qunatidade de minutos.
		 Com base nos minutos informados, o programa mostra quantas horas exatas aqueles minutos possuem, e os minutos complementares.
		 Para esta tarefa usaremos duas operaçoes:
		 - Divisão inteira (/)
		 - Resto da divisão (%)
		 */
		
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos: "));
		int horas = minutos / 60;
		int minutosRestantes = minutos % 60;
		System.out.println("Horas exatas: " + horas);
		System.out.println("Minutos restantes: " + minutosRestantes);
		
	}

}
