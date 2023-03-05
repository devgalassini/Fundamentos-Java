package qintess.academiajava.utils;

public class Utilitarios {
 public double somar(double x, double y) {
	  double resultado = x + y;
	  return resultado;
	  
	  
	  //Método que recebe um valor em dolares e retorna este valor em reais 
	  //(Toamando como basse o valor do dia 14/04/2022 : 4.696)
	  
	  public static dolarParaReal(double dolar) {
		  return dolar * 4.696;
	  }
 }
}
