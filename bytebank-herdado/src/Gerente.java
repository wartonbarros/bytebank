// extends faz a classe gerente herdar os atributos da classe Funcionario, = herança, e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	// inicio atributos
	
	private int senha; // inicializa automaticamente com 0
	
	// fim atributos
	
	
	
	// inicio construtor
	
	public Gerente() { // o construtor não retorna nada
		
		
		
	}
	
	// fim construtor
	
	
	
	// inicio metodos
	
	
	
	public double getBonificacao() { //método reescrito da classe mãe
		System.out.println("Chamando o método de bonificacao do Gerente");
		return super.getSalario(); //super indica que o atributo salário e o método getBonificacao são da classe mãe
		
	} // em vez de deixar atributos não privados na classe mãe, e acessa-los diretamente, melhor acessa-los sempre por métodos

	
	
	// métodos da interface Autentica
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	// fim métodos da interface autentica
	
	
	
	
	// fim metodos
	
	
	
	
	
	// inicio getters e setters
	
	
	
	// fim getters e setters

}
