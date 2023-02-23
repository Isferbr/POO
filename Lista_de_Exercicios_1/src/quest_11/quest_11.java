/*
* Nome: Ismael Fernandes Brito
* Matrícula: 20202103020266
*/

package quest_11;

import java.util.Scanner;

public class quest_11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.println("Digite um número: ");
		num = teclado.nextInt();
		
		for (int i = 1; i <= num; i++) {
			soma = soma + i;
		}
		
		System.out.println("A soma é: " + soma);
		
		teclado.close();
	}

}
