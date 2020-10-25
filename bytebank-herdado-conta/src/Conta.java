public abstract class Conta {	// abstract = ninguém pode instanciar objetos da classe conta
	
	protected double saldo; //atributos
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // static está tornando este atributo da classe e não somente do objeto
	
		
	
	// contrutor que força a criação do número e agência na criação da conta
	public Conta(int agencia, int numero) { // construtor
		
		Conta.total++; //a cada conta criada será icrementado + 1
//		System.out.println("o total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
//		System.out.println("estou criando uma conta" + this.numero);
	}
	
	
	
	// início métodos 
	
	public abstract void deposita(double valor); //metódo deposita, abstract, terá que ser implementado nas classes filhas
		
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) { 
		if(this.saldo >= valor) {
			this.saldo-=valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	// fim métodos 
	
	
	// início geters e seters 
	
	public double getSaldo() {
		
		return this.saldo;
		
	}
	
	public int getNumero() {
		
		return this.numero;
		
	}
	
	public void setNumero(int numero) {
		
		if(numero <= 0) {
			System.out.println("não pode valor <= 0");
			return;
		}
		this.numero = numero;
		
	}
	
	public int getAgencia() {
		
		return this.agencia;
		
	}
	
	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			System.out.println("não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
		
	}
	
	public void setTitular(Cliente titular) {
		
		this.titular = titular;
		
	}
	
	public Cliente getTitular() {
		
		return titular;
		
	}
	
	public static int getTotal() { // static define que esta método é da classe e não somente de uma instância
		
		return Conta.total;
		
	}
	
	// fim geters e seters 
	
}