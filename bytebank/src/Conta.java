public class Conta {	
	
	double saldo; //atributos
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) { //metódo deposita
		
		this.saldo = saldo + valor;
		
	}
	
}