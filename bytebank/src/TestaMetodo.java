
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		
		System.out.println(conseguiuRetirar);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTranferencia = contaDaMarcela.transfere(3000, contaDoPaulo);
		if(sucessoTranferencia) {
			
			System.out.println("Transferência com sucesso");
			
		} else {
			System.out.println("faltou dinheiro");
		}
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
	}

}
