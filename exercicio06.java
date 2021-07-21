package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("quantos alunos tem na sala?");
		int alunos = sc.nextInt();

		for (int i = 0; i < alunos; i++) {
			System.out.println("primeira nota (com peso 2.0):");
			double primeiraNota = sc.nextDouble();
			System.out.println("segunda nota(com peso 3.0):");
			double segundaNota = sc.nextDouble();
			System.out.println("terceira nota(com peso 5.0:)");
			double terceiraNota = sc.nextDouble();
			
			double media = (primeiraNota * 2.0 + segundaNota * 3.0 + terceiraNota * 5.0) /10.0;
			
			System.out.printf("média: %.2f%n", media);
		}
		


		sc.close();
	}

}
