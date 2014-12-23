package br.com.treinaweb.parte3;

public class TesteString {
	public static void main(String args[]){
		String dominio = "www.treinaweb.com.br";
		//Obtendo a posicicao de um caracter ou string da string
		int posicao = dominio.indexOf("com");
		System.out.println(posicao);
		
		//obtendo o tamanho da String
		int tamanho = dominio.length();
		System.out.println(tamanho);
		
		//substituindo caracteres na string
		String dominioAlterado = dominio.replace("www", "org");
		System.out.println(dominioAlterado);
		
		//obter uma parte de string
		String parteDominio = dominio.substring(4,20);
		System.out.println(parteDominio);
		
		//Convertendo String para maiuscula
		String dominioMaiuscula = dominio.toUpperCase();
		System.out.println(dominioMaiuscula);
		
	}
}
