
public class Cadeira {
    String marca; 
    String cor; 
    float altura; 
    
    void subir(float aumentar) {
    this.altura = this.altura + aumentar;
    }

   
    void descer(float diminuir) {
    this.altura = this.altura - diminuir;
    }

    public static void main(String[] args) {
     Cadeira c1 = new Cadeira();

       
    c1.marca = "Dell";
    c1.cor = "Rosa";
    c1.altura = 10.0f;

    System.out.println("Marca de c1: " + c1.marca);
    System.out.println("Cor de c1: " + c1.cor);
    System.out.println("Altura de c1: " + c1.altura);

    c1.subir(7.0f);
    System.out.println("Altura de c1: " + c1.altura);

    c1.descer(5.0f);
    System.out.println("Altura de c1: " + c1.altura);

 }

 }
