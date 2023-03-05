package qintess.academiajava.introducao;

public class Preliminares {
public static void main(String[] args) {
	
	//varivaeis recebendo um valor fixo
	double valor1 = 100;

	//variaveis recebendo o valor de outra variavel
	double valor2 = valor1;
	
	//variaveis recebendo o valor de outras duas variaveis
	double valor3 = valor1 + valor2;
	
	//variavel recebendo o valor proveniente de uma constante  definida no JRE
	double valor4 = Math.PI;
	
	// variavel recebendo o valor de retorno de  um método // variavel se declara uma vez 
	double valor5 = Math.random();
	
	//a variaveil valor6 recebe um numero como resultado da conservão de uma String
	String s = "1230";
	double valor6 = Double.parseDouble(s);
	
	//apresentando cada variavel na tela 
	System.out.println(valor1);
	System.out.println(valor2);
	System.out.println(valor3);
	System.out.println(valor4);
	System.out.println(valor5);
	System.out.println(valor6);
  }
}
