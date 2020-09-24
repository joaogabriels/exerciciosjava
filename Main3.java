import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, diferenca;

		System.out.println("Digite o valor de quatro produtos (inteiros)");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		diferenca = ((a * b) - (c * d));
		System.out.printf("DADOS DIGITADOS: %d, %d, %d, %d", a, b, c, d);
		System.out.printf("%nA diferença entre os produtos AB e CD é igual a: %d%n", diferenca);

	}

}
