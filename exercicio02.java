package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("informe x.");
		double x = sc.nextDouble();
		System.out.println("informe y.");
		double y = sc.nextDouble();

		while (x != 0 || y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro quadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("segundo quadrante.");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante.");
			} else {
				System.out.println("quarto quadrante.");
			}
			System.out.println("informe x.");
			x = sc.nextDouble();
			System.out.println("informe y.");
			y = sc.nextDouble();
		}
		System.out.println("FIM");
		sc.close();
	}

}
