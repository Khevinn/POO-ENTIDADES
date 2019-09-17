

public class Carro {
    private String marca; 
    private String cor; 
    private float velocidade; 
	

     
	public String getMarca() {
		return this.marca;
	}
	
     
	public void setMarca(String marca) {
		if (marca == null || marca.length() == 0) { 
			return;
		}

		this.marca = marca;
	}
     
     
	public String getCor() {
		return this.cor;
	}
	

	public void setCor(String cor) {
		if (cor == null || cor.length() == 0) {
			return;
		}
		this.cor = cor;
	}
	
	
	public float getVelocidade() {
		return this.velocidade;
	}
	
	public void setVelocidade(float velocidade) {
		if (velocidade < 0.0f) {
			return;
		}
		this.velocidade = velocidade;
	}

   
    
    public void acelerar(float incremento) {
        this.velocidade = this.velocidade + incremento;
    }

    public void desacelerar(float decremento) {
        this.velocidade = this.velocidade - decremento;
    }

    public static void main(String[] args) {
        Carro c1 = new Carro();
		
        
        c1.setMarca("Mercedes");
        c1.setCor("Prata");
        c1.setVelocidade(30.0f);

        System.out.println("Marca de c1: " + c1.getMarca());
        System.out.println("Cor de c1: " + c1.getCor());
        System.out.println("Velocidade de c1: " + c1.getVelocidade());

        c1.acelerar(20.0f);
        System.out.println("Velocidade de c1: " + c1.getVelocidade());

        c1.desacelerar(10.0f);
        System.out.println("Velocidade de c1: " + c1.getVelocidade());



     }

}