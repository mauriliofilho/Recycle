package br.com.treinaweb.parte3;

public class TesteDouble {
	public static void main(String args[]){
		//Obtendo o menor e o maior valor
		double maior = Double.MAX_VALUE;
		double menor = Double.MIN_VALUE;
		System.out.println("Maior valor :" + maior);
		System.out.println("Menor valor :" + menor);
		
		String s = "123";
		double b = 0;
		//Convertendo String para Double
		b = Double.parseDouble(s);
		//Convetendo de Double para String;
		s = Double.toString(b);
	}
}
