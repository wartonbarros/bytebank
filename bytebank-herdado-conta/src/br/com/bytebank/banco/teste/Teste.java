package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
		
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);
		Object cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
//		println(cliente);
		
	}
	
	static void println() {}
	
	static void println(int a) {}
	
	static void println(boolean valor) {}
	
	// Toda classe no java herda da classe Object mesmo que isto não seja declarado 
	static void println(Object conta) {}

}