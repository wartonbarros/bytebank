
public class Fluxo {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        
        
        
        try { // comando tentar, para tratar excessões
        	
        metodo1();
        
        } 
        
        catch(ArithmeticException | NullPointerException | MinhaExcecao ex) { // catch = pegar, pega o erro para tratar, no caso ArithmeticException
        	String msg = ex.getMessage(); // getMessage é um método da referência ArithmeticException
        	System.out.println("Exception " + msg);
			ex.printStackTrace(); // imprimir rastro da pilha
        }
        
        
        
        
        System.out.println("Fim do main");
    }

	
	
    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    
    
    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
//        ArithmeticException ex = new ArithmeticException("deu errado");
//        throw ex; // jogando objeto ArithmeticException na pilha 
        throw new MinhaExcecao("deu muito errado");
        
        
        
//        System.out.println("Fim do metodo2");
    }

}
