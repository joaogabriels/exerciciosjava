import java.util.Scanner;
import java.util.Locale;

public class Main6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = 3.14159;

		System.out.println("Digite os valores de A, B e C");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		System.out.printf("Os valores digitados foram: %.3f, %.3f e %.3f%n", a, b, c);

		triangulo = ((a * c) / 2);
		circulo = ((c * pi) *c);
		trapezio = (((a + b) * c) / 2);
		quadrado = Math.pow(b, 2);
		retangulo = (a * b);

		System.out.printf("%nTRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

		sc.close();

	}

}
