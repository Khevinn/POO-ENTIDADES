 public class Impressor extends Impressora {
	

	public Impressor(String palavras) {
		super(palavras);

	}

	
	public String imprimir () {
		return super.getTxt().toLowerCase();
	}
	
} 

