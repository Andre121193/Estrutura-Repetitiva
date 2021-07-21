package estruturasRepetitivas;

import java.util.Scanner;

public class usandoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 5;
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();

		}
		System.out.println("somatória dos valores: " + soma);
		sc.close();
	}

}
