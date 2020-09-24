import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code;
		double workhour, value, salary;

		System.out.println("Type the code of the worker:");
		code = sc.nextInt();
		
		System.out.println("Now, type the amount of hours worked");
		workhour = sc.nextDouble();
		
		System.out.println("Now, type the value of the work hours");
		value = sc.nextDouble();
		
		salary = (value * workhour);
		System.out.println("Worker number:" + code);
		System.out.printf("The value of the salary is: %.2f", salary);
	}

}
