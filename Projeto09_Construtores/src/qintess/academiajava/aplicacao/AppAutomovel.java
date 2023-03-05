package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {
		Automovel auto1 = new Automovel("Ford");
		Automovel auto2 = new Automovel("Onix", "Fiesta");
		Automovel auto3 = new Automovel("Onix", "Fiesta", 2008);

		System.out.println(auto1.mostrar());
		System.out.println("---------------------");
		
		
		System.out.println(auto2.mostrar());
		System.out.println("---------------------");
		
		System.out.println(auto3.mostrar());
		

	}
}
