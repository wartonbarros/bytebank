
public class FluxoComTratamento {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        
        
        
        try { // comando tentar, para tratar excessões
        	
        metodo1();
        
        } 
        
        catch(ArithmeticException | NullPointerException ex) { // catch = pegar, pega o erro para tratar, no caso ArithmeticException
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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            	int a = i / 0; // problema = ArithmeticException
//            	Conta c = null; // problema = NullPointerException
//            	c.deposita();
            	
        }
        System.out.println("Fim do metodo2");
    }

}
