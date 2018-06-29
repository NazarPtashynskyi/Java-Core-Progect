package weekone.lesson1;

import java.util.Scanner;

public class CountPhoneCalls {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("How much does a minute call cost in the USA?");
		double pcUsa = sc.nextDouble();
		System.out.println("How many time have u talked? (Enter dollars,cents. For ex.: 2,30)");
		double mtUsa = sc.nextDouble();
		System.out.println("Your phone call are costs: " + pcUsa * mtUsa );
		System.out.println("How much does a minute call cost in the Poland? (Enter Zl, cents. For ex.: 2,30)");
		double pcPL = sc.nextDouble();
		System.out.println("How many time have u talked? (Enter Minutes, Seconds. For ex.: 5,36)");
		double mtPL = sc.nextDouble();
		System.out.println("Your phone call are costs: " + pcPL * mtPL );
		System.out.println("How much does a minute call cost in the Ukraine? (Enter Gryvna, copeks. For ex.: 2,30)");
		double pcUA = sc.nextDouble();
		System.out.println("How many time have u talked? (Enter Minutes, Seconds. For ex.: 5,36)");
		double mtUA = sc.nextDouble();
		System.out.println("Your phone call are costs: " + pcUA * mtUA );
	}

}
