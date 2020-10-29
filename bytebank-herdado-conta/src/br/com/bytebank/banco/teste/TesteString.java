package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; //object literal
		// String nome = new String("Alura");
		// Uma vez iniciado uma String, ela não pode ser alterada, imutabilidade
		
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		System.out.println(nome.length());
//		for(int i =0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		
//		char c = 'A'; // char armazena apenas 01 caractere
//		char d = 'a';
//		
//		String outra = nome.replace(c, d);
		
//		nome.toLowerCase();
		
//		String outra = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
		
	}

}
