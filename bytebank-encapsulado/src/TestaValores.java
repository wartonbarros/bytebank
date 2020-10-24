
public class TestaValores {
	
	public static void main(String[] args) {
		
		// criando conta com os parâmetros definidos no contrutor de agência e número 
		Conta conta = new Conta(1337, 24336);
		
		System.out.println(conta.getAgencia());
		
		
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(2112, 14660);
		
		
		System.out.println(Conta.getTotal());

		
	}

}
