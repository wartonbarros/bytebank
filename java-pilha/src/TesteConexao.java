
public class TesteConexao {
	
	public static void main(String[] args) {
		
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		//--------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conexão");
//		} finally { // usado para fechar a conexão independente de erro ou não
//			System.out.println("finally");
//			if(con != null) {
//			con.close();
//			}
//		}
		
		
		
		
		
		
		
	}

}
