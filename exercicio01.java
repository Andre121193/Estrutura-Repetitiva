package estruturasRepetitivas;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int senhaSalva = 2002;
		System.out.println("informe a senha:");
		int senhaInformada = sc.nextInt();
		
		while (senhaInformada != senhaSalva) {
			System.out.println("Senha invalida.");
			senhaInformada = sc.nextInt();
		}
		
		System.out.println("Acesso permitido.");
		
		sc.close();
		
	}

}
