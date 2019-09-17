public class Retangulo {
    float base; 
    float altura; 

    public static void main(String[] args) {
        
        Retangulo r1 = new Retangulo();

        
        r1.base = 10;
        r1.altura = 20;

        System.out.println("Base de r1: " + r1.base);
        System.out.println("Altura de r1: " + r1.altura);

        Retangulo r2 = new Retangulo();

       
        r2.base = 5;
        r2.altura = 14;

        System.out.println("Base de r2: " + r2.base);
        System.out.println("Altura de r2: " + r2.altura);

    }

}