// contrato Autenticavel
	// Quem assina eses contrato, precisa implementar
		// metódo setSenha
		// metódo autentica


public abstract interface Autenticavel{
	
	
	public abstract void setSenha(int senha);
	
	
	public abstract boolean autentica(int senha);
		
}
