import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.println("Digite um n�mero X");
		x = sc.nextInt();
		
		System.out.println("Agora, digite um n�mero Y");
		y = sc.nextInt();
		
		z = x + y;
		
		System.out.println("Os valores digitados foram:");
		System.out.printf("X = %d%n", x);
		System.out.printf("Y = %d%n", y);
		System.out.printf("O valor da soma dos dois valores �: %d ", z);
		
	}

}
