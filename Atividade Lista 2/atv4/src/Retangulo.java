
import java.util.Scanner;

public class Retangulo implements Quadrilatero{
     float lado;
     float altura;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return this.lado * this.altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2 * (this.lado + this.altura);
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         float l, a;
         System.out.println("Digite um número");
         l = sc.nextFloat();
         System.out.println("digite outro");
         a = sc.nextFloat();
         Retangulo c1 = new Retangulo(5,5);
         System.out.println("o valor da area é " + c1.calcularArea());
         System.out.println("o valor do perimetro é " + c1.calcularPerimetro());
    }
    
   
}
