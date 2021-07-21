package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("fatorial de:");
		int n = sc.nextInt();
		int fat = 1;

		for (int i = 1; i <= n; i++) {
		
				fat *= i;
		

		}
		System.out.println(fat);
		sc.close();
	}

}
