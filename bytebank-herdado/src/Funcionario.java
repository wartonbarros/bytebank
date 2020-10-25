
public abstract class Funcionario { // abstract torna a classe abstrata, não podendo instanciar objetos a partir dela
	
	
	// inicio atributos
	
	// modificadores de visibilidade, public = visível para todas as classes, protected = visível para as classes 
	// filhas, private, visível apenas para a classe
	
	private String nome;
	private String cpf;
//	protected double salario; // protected está entre public e private, e significa publico para os filhos
	private double salario;
	
	
	// fim atributos
	
	
	
	// inicio construtor
	
	public Funcionario() { // o construtor não retorna nada
		
		
		
	}
	
	// fim construtor
	
	
	
	// inicio metodos
	
	public abstract double getBonificacao(); // método sem implementação padrão; abstract = método sem corpo
	
	// fim metodos
	
	
	
	
	
	// inicio getters e setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// fim getters e setters

}
