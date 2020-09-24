import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int q1, q2;
		double c1, v1, c2, v2, total;

		System.out.println("Insira o codigo da peça 1");
		c1 = sc.nextDouble();
		System.out.println("Insira a quantidade de peças 1");
		q1 = sc.nextInt();
		System.out.println("Insira o valor da peça 1");
		v1 = sc.nextDouble();
		System.out.printf("COMPUTADO: %.2f, %d, %.2f", c1, q1, v1);
		
		System.out.printf("%n%nInsira o codigo da peça 2");
		c2 = sc.nextDouble();
		System.out.println("Insira a quantidade de peças 2");
		q2 = sc.nextInt();
		System.out.println("Insira o valor da peça 2");
		v2 = sc.nextDouble();
		System.out.printf("COMPUTADO: %.2f, %d, %.2f", c2, q2, v2);
	
		total = (q1 * v1) + (q2 * v2);
		System.out.printf("%n%nValor a pagar: %.2f ", total);
	}
	
}
