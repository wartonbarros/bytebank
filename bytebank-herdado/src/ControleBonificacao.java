
public class ControleBonificacao {
	
	private double soma;
	
	
	
	public void registra(Funcionario f) { // polimorfismo, esse código será usado por todo tipo de funcionário 
										  // para calcular a bonificação, sem precisar implementar vários métodos,
										  // foi colocado como referência a classe mais genérica, Funcionário
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
	}
	
	
	
	public double getSoma() {
		return soma;
	}

}
