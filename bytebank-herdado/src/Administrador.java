
public class Administrador extends Funcionario implements Autenticavel{
	
	public int senha;
	
	
	@Override
	public double getBonificacao() {
		return 50;
	}

	// métodos da interface Autenticavel
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
	// fim métodos da interface Autenticavel
	
	

}
	
	
