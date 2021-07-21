package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantas vezes:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++ ) {
			System.out.printf("dividendo:");
			int a = sc.nextInt();
			System.out.println("divisor:");
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("divisão impossivel.");
			} else {
				double divisao = a / b;
				System.out.printf("resultado: %.1f%n", divisao);
			}
			
			
		}
		
		
		sc.close();
	}

}
