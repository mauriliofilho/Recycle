package br.com.treinaweb.parte3;

public class TesteInteger {
	public static void main(String args[]){
		//Obtendo o menor e o maior valor
		int maior = Integer.MAX_VALUE;
		int menor = Integer.MIN_VALUE;
		System.out.println("Maior valor :" + maior);
		System.out.println("Menor valor :" + menor);
		
		String s = "123";
		int b = 0;
		//Convertendo String para Byte
		b = Integer.parseInt(s);
		//Convetendo de Byte para String;
		s = Integer.toString(b);
	}
}
