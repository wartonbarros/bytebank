// extends faz a classe gerente herdar os atributos da classe funcionário = herança
public class Designer extends Funcionario {
	
	// inicio atributos
	
	
	// fim atributos
	
	
	
	// inicio construtor
	
		
	// fim construtor
	
	
	
	// inicio metodos
	
	
	public double getBonificacao() { //método reescrito da classe mãe
		System.out.println("Chamando o método de bonificacao do Designer");
		return 200; //super indica que o atributo salário e o método getBonificacao são da classe mãe
		
	} // em vez de deixar atributos não privados na classe mãe, e acessa-los diretamente, melhor acessa-los sempre por métodos
	
	// fim metodos
	
	
	
	
	
	// inicio getters e setters
	
	
	
	// fim getters e setters

}
