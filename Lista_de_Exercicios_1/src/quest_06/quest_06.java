/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_06;

import java.util.Scanner;

public class quest_06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3, maior;
		
		System.out.printf("Digite o primeiro número: ");
		n1 = teclado.nextInt();
		System.out.printf("Digite o segundo número: ");
		n2 = teclado.nextInt();
		System.out.printf("Digite o terceiro número: ");
		n3 = teclado.nextInt();
		
		maior = n1;
		
		if (n2 > maior) {
			maior = n2;
		}
		if (n3 > maior) {
			maior = n3;
		}
		
		System.out.printf("O maior número é: %d%n", maior);
		
		teclado.close();
	}
	
}
