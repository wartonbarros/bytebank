
public class ContaCorrente extends Conta { // você herda atributos e métodos, mas não herda construtores
	
	public ContaCorrente(int agencia, int numero) { // construtor
		
		super(agencia, numero);
		
	}
	
	
	// marcador deixando implícito que queremos sobrescrever o mesmo método da classe mãe
	@Override 
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		
			
	}


	@Override
	public void deposita(double valor) {
//		super.saldo = super.saldo + valor;
		super.saldo += valor;
	}
	
	

}
