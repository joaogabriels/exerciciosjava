import java.util.Scanner;
import java.util.Locale;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio, res1 ,res2;
		
		System.out.println("Digite o valor do raio da circunferência");
		raio = sc.nextDouble();
		
		res1 = Math.pow(raio, 2);
		res2 = pi * res1;

		System.out.printf("O valor da área da circunferencia é: %.4f", res2);

	}

}
