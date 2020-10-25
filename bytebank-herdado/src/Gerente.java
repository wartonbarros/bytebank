// extends faz a classe gerente herdar os atributos da classe funcionário = herança
public class Gerente extends Funcionario {
	
	// inicio atributos
	
	private int senha; // inicializa automaticamente com 0
	
	// fim atributos
	
	
	
	// inicio construtor
	
	public Gerente() { // o construtor não retorna nada
		
		
		
	}
	
	// fim construtor
	
	
	
	// inicio metodos
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public double getBonificacao() { //método reescrito da classe mãe
		System.out.println("Chamando o método de bonificacao do Gerente");
		return super.getBonificacao() + super.getSalario(); //super indica que o atributo salário e o método getBonificacao são da classe mãe
		
	} // em vez de deixar atributos não privados na classe mãe, e acessa-los diretamente, melhor acessa-los sempre por métodos
	
	// fim metodos
	
	
	
	
	
	// inicio getters e setters
	
	
	
	// fim getters e setters

}
