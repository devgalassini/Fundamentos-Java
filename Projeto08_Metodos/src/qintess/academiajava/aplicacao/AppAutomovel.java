package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {
		Automovel auto1 = new Automovel(); //Criando o objeto
		auto1.receber("Fiat", "Fusio", 2020);
		
		Automovel auto2 = new Automovel();
		auto2.receber("Nissan", "350z", 2008);
		
		System.out.println(auto1.mostrar());
		System.out.println("---------------------");
		System.out.println(auto2.mostrar());
	}
}